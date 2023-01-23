function getAllVariantesApi() {
			return $.ajax({
				url: "/api/variant/get",
				method: "GET",
				async: false

			});
		}
		
		function getAllVariantPaginationApi(keyword,limit,page){
				return $.ajax({
				url: "/api/variant/pagination?keyword=" + keyword + "&limit=" + limit + "&page="+ page,
				method: "GET",
				async: false
			});
			
		}
		
		
		//Search dan GET
		function searchVariantApi(keyword,limit,page){
				return $.ajax({
				url: "/api/variant/search?keyword=" + keyword,
				method: "GET",
				async: false
			});
		}
		
		function refreshList(keyword,page) {
			
			var limit = 4;
			
			if(keyword == null){
				
				keyword=$("#example-search-input").val();
			}
			
				if(page == null){
				
				page = 1;
			}
			

			var response = getAllVariantPaginationApi(keyword,limit,page).responseJSON;    //Manggil semua data
			console.log(response);

			var list = response.data.data;
			$("#content-tbody").html("");

			//---------- GET ALL VARIANT------------------------------

			for (i = 0; i < list.length; i++) {
				$("#content-tbody").append(
					`
				<tr>
				    <td>${list[i].category_name} </td>
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
						    '${list[i].id}',
						    '${list[i].category_name}',
						    '${list[i].category_id}')">                                          
							<i class="fa-solid fa-pen-to-square" color="white"></i>
						</button>
						<!--ini yang ngirim dari read(response)-->
						<button class="btn btn-danger" onclick="bukaPopupHapus(
							'${list[i].initial}',
							'${list[i].name}', 
						    ${list[i].active},
						    '${list[i].id}',
						     '${list[i].category_name}',
						    '${list[i].category_id}',)">                                          
							<i class="fa-solid fa-trash"></i>
						</button>
					</td>

				</tr>
				
				`
				)
			}
			
			//Kosongin
			$("#pagination").html("");
			
			//Hitung total page
			// 3 dari 10 -> 4 halaman 10/3 dibuletin keatas
			// 4 dari 10 -> 3 halaman 10/4 dibuletin keatas
			//Math.ceil = pembulatan keatas
			var totalPage = Math.ceil(response.data.total_data / limit);
			console.log(totalPage);
			
				$("#pagination").append(`
				<li class="page-item ${page == 1 ? 'disabled' : ''}"><a class="page-link" href="#"
				 onclick="refreshList(null,${page-1})"
				>Previous</a></li>		
				`)
			
			for(i = 1; i <= totalPage;i++){
				$("#pagination").append(`
				<li class="page-item ${page == i ? 'active' : ''}"><a class="page-link" href="#"
				 onclick="refreshList(null,${i})"
				>${i}</a></li>		
				`)	
			}
			
			$("#pagination").append(`
				<li class="page-item ${page == totalPage ? 'disabled' : ''}"><a class="page-link" href="#"
				 onclick="refreshList(null,${page+1})"
				>Next</a></li>		
				`)
			
		}

		refreshList();