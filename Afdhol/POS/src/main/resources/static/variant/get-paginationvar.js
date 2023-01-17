function getAllVariantsApi(){
		return $.ajax ({
			
			url : "/api/variant/get",
			method : "GET",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	
	function searchVariantssApi(keyword){
		return $.ajax({
			
		url : "/api/variant/search?keyword="+ keyword,
			method : "GET",
			async : false	
			
		})
	}
	
	function getAllVariantsPaginationApi(keyword,limit,page){
		return $.ajax({
			
		url : "/api/variant/pagination?keyword="+keyword+"&limit="+limit+"&page="+page,
			method : "GET",
			async : false	
			
		})
		
	}
	
	function refreshList(keyword, page){
		
		var limit = 3;
		
		if(keyword == null){
			keyword = $("#example-search-input").val();
		}
		
		if(page == null){
			page = 1;
		}
		
	var response = getAllVariantsPaginationApi(keyword,limit,page).responseJSON;
	console.log(response);	
	
	var list = response.data.data;
	
	$("#content-tbody").html(""); //mengosongkan sebelum menambahkan semua
	
	for(i=0; i<list.length; i++){
		$("tbody").append(
			`
			<tr> 
				<td>${list[i].category_name}</td>
				<td>${list[i].initial}</td>
				<td>${list[i].name}</td>
				<td><input type="checkbox" disabled 
					${list[i].active == true ? 'checked' : ''}></td>
				<td>
				<button class="btn btn-warning" 
				onclick="bukaPopupEdit(
					'${list[i].initial}', 
					'${list[i].name}',
					${list[i].category_id},
					'${list[i].category_name}',
					${list[i].active},
					${list[i].id})">
					<i class="fa-regular fa-pen-to-square" color="white"></i>
					</button>
				<button class="btn btn-danger" 
				onclick="bukaPopupHapus(
					'${list[i].category_name}',
					'${list[i].initial}',
					'${list[i].name}',
					${list[i].active},
					${list[i].id})">
					<i class="fa-regular fa-trash-can"></i></button>
				</td>
			</tr>
				
			`
		)
		}
		
		//Mengosongkan
		$("#pagination").html("");
		//rumus hitung page
		// 3 dari 10 = 4 halaman 10/3 dibuletin ke atas
		// 4 dari 10 = 3 halaman 10/4 bulatkan ke tas
		var totalPage = Math.ceil(response.data.total_data/limit);
		console.log(totalPage);
		
		$("#pagination").append(`
		<li class="page-item ${page == 1 ? 'disabled' : ''}" ><a class="page-link" href="#"
		onclick= "refreshList(null,${page-1})"
		>Previous</a></li>
		`)
		
		for(i=1; i<=totalPage; i++){
		$("#pagination").append(`
		<li class="page-item ${page == i ? 'active' : ''}" ><a class="page-link" href="#"
		onclick= "refreshList(null,${i})"
		>${i}</a></li>
		`)
		
	}
	$("#pagination").append(`
		<li class="page-item ${page == totalPage ? 'disabled' : ''}" ><a class="page-link" href="#"
		onclick= "refreshList(null,${page+1})"
		>Next</a></li>
		`)
		
	}
	
	
	refreshList();	
	
	