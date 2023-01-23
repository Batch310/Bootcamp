//----------------GET ALL CATEGORY------------------
	function getAllCategoriesApi(){
		return $.ajax({
			url : "/api/category/get",
			method : "GET",
			async : false
			
		});
	}
	function refreshList(){
		var response = getAllCategoriesApi().responseJSON;
		console.log(response);
	
		var list = response.data;
		$("#content-tbody").html("");
		for(i = 0; i< list.length; i++){
		$("#content-tbody").append(
			`
			<tr> <!-- Baris 1 -->
				<td>${list[i].initial}</td> <!-- Kolom -->
				<td>${list[i].name}</td>
				<td><input type="checkbox" disabled ${list[i].active == true ? 'checked':''}></td>
				<td>
					<button class="btn btn-warning" onclick="bukaPopupEdit(
						'${list[i].initial}',
						'${list[i].name}',
						${list[i].active},
						${list[i].id})">
						<i class="fa-solid fa-pen-to-square" color="white"></i>
					</button>
					<button class="btn btn-danger" onclick="deletePopUp(
						'${list[i].initial}',
						'${list[i].name}',
						${list[i].active},
						${list[i].id})">
						<i class="fa-solid fa-trash-can" color="white"></i>
					</button>
				</td>
			</tr>
			`
		)
		
	}
	}
	refreshList();
	
	//------------------------------------------------------------------------