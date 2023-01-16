function getAllCategoriesApi(){
		return $.ajax ({
			
			url : "/api/category/get",
			method : "GET",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	
	function refreshList(){
		var response = getAllCategoriesApi().responseJSON;
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
	
	