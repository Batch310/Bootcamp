function getAllCategoriesApi(){
		return $.ajax ({
			
			url : "/api/category/get",
			method : "GET",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	
	function searchCategoriesApi(keyword){
		return $.ajax({
			
		url : "/api/category/search?keyword="+ keyword,
			method : "GET",
			async : false	
			
		})
	}
	
	function refreshList(keyword){
		
		if(keyword == null){
			keyword = "";
		}
		
		var response = searchCategoriesApi(keyword).responseJSON;
	console.log(response);	
	
	var list = response.data;
	
	$("#content-tbody").html(""); //mengosongkan sebelum menambahkan semua
	
	for(i=0; i<list.length; i++){
		$("tbody").append(
			`
			<tr> 
				<td>${list[i].initial}</td>
				<td>${list[i].name}</td>
				<td><input type="checkbox" disabled 
					${list[i].active == true ? 'checked' : ''}></td>
				<td>
				<button class="btn btn-warning" 
				onclick="bukaPopupEdit(
					'${list[i].initial}', 
					'${list[i].name}',
					${list[i].active},
					${list[i].id})">
					<i class="fa-regular fa-pen-to-square" color="white"></i>
					</button>
				<button class="btn btn-danger" 
				onclick="bukaPopupHapus(
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
	}
	
	
	refreshList();	
	
	