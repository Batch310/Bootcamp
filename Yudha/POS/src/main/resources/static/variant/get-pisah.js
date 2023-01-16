//-------------------------------------------READ------------------------------------------------------------
		function getAllVariantsApi(){
			return $.ajax({
				url : "/api/variant/get",
				method : "GET",
				async : false
				
			});
		}
		
		function refreshList(){
			var response = getAllVariantsApi().responseJSON;
			console.log(response);
		
			var list = response.data;
		
			$("#content-tbody").html("")
		
			for(i=0; i<list.length; i++){
				$("#content-tbody").append(
				`
				<tr> <!-- Baris -->
				<td>${list[i].category_name}</td>
					<td>${list[i].initial}</td> <!-- Kolom  -->
					<td>${list[i].name}</td>
					<td><input type="checkbox" disabled
					${list[i].active == true ? 'checked' : ''}></td>
					<td>
						<button type="button" class="btn btn-warning" onclick="bukaPopupEdit(
							'${list[i].category_name}','${list[i].initial}','${list[i].name}', ${list[i].active},${list[i].category_id},${list[i].id})">
							<i class="fa-solid fa-pen-to-square" color="white"></i>
						</button>
						<button type="button" class="btn btn-danger" onclick="bukaPopupDelete(
							'${list[i].category_name}','${list[i].initial}','${list[i].name}', ${list[i].active},${list[i].category_id},${list[i].id})">
							<i class="fa-solid fa-trash" color="white"></i>
						</button>
					</td>
				</tr>
				`
			)
		}
		}
		
		refreshList();