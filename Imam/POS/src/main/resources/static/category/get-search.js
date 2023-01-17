function getAllCategoriesApi() {
			return $.ajax({
				url: "/api/category/get",
				method: "GET",
				async: false

			});
		}
		
		function searchCategoryApi(keyword){
				return $.ajax({
				url: "/api/category/search?keyword=" + keyword,
				method: "GET",
				async: false
			});
		}
		
		//Search dan GET
		function refreshList(keyword) {
			
			if(keyword == null){
				
				keyword="";
			}
			
			var response = searchCategoryApi(keyword).responseJSON;    //Manggil semua data
			console.log(response);

			var list = response.data;
			$("#content-tbody").html("");

			//---------- GET ALL CATEGORIES------------------------------

			for (i = 0; i < list.length; i++) {
				$("#content-tbody").append(
					`
				<tr>
					<td>${list[i].initial}</td> <!-- Kolom -->
					<td>${list[i].name} </td>
					<td><input type="checkbox" disabled 
						${list[i].active == true ? 'checked' : ''}></td>
					<td>
						<button class="btn btn-warning" 
						onclick="bukaPopupEdit(
							'${list[i].initial}',
							'${list[i].name}', 
						    ${list[i].active},
						    '${list[i].id}')">                                          
							<i class="fa-solid fa-pen-to-square" color="white"></i>
						</button>
						<button class="btn btn-danger" onclick="bukaPopupHapus(
							'${list[i].initial}',
							'${list[i].name}', 
						    ${list[i].active},
						    '${list[i].id}')">                                          
							<i class="fa-solid fa-trash"></i>
						</button>
					</td>

				</tr>
				
				`
				)
			}

		}

		refreshList();