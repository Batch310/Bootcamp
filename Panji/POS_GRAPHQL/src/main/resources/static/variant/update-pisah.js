		function getAllCategoriesApi(){
			return $.ajax({
				url : "/api/category/get",
				method : "GET",
				async : false
					
			});
		}

		function editVariantApi(categoryDto){
			return $.ajax({
				url : "/api/variant/update",
				method : "PUT",
				data : categoryDto,
				contentType : "application/json",
				async : false
			});
		}



		function bukaPopupEdit(initial,name,active,id,category_name,category_id){
			console.log("Add Edit Clicked")
			console.log(initial+" "+name+" "+active+" "+id+" "+category_name+" "+category_id)
			
			var catResponse = getAllCategoriesApi().responseJSON.data;
			var html = "";
			
			for(i = 0; i< catResponse.length; i++){
				html += `<option value = ${catResponse[i].id}>${catResponse[i].name}</option>`
			}
			
			// Ganti Title
			$(".modal-title").html("Edit");
					
			// Isi Modal Body
			$(".modal-body").html(
				`
				<table class="table table-borderless">
					<tr>
						<td>Category</td>
						<td>
							<select id="input-category" class="form-control">
							<option hidden disabled selected> ${category_name} </option>
							${html}
							</select>
						</td>			
					</tr>
					<tr>
						<td>Initial</td>
						<td>
							<input id="input-initial" class="form-control" value="${initial}">
						</td>			
					</tr>
					<tr>
						<td>Name</td>
							<td>
								<input id="input-name" class="form-control" value="${name}">
							</td>			
					</tr>
					<tr>
						<td>Active</td>
							<td>
								<input id="input-active" type="checkbox" ${active == true ? 'checked' : ''}>
							</td>			
					</tr>
					<tr>
						<td></td>
							<td>
								<button id="input-cancel" type="button" class="btn btn-light">Cancel</button>
								<button id="input-save" type="button" class="btn btn-warning">Save Changes</button>
							</td>
										
					</tr>
				</table>
						`
					)
					
					$("#input-cancel").click(function(){
						$(".modal").modal("hide");
					})
					
					$("#input-save").click(function(){
						// Ambil Category Name
						var categoryName = $("#input-category").val();
						console.log(categoryName)
						// Ambil Initial
						var initial = $("#input-initial").val();
						console.log(initial);
						// Ambil Name
						var name = $("#input-name").val();
						console.log(name);
						// Ambil Active
						var active = $("#input-active").prop("checked");
						console.log(active);
						
						// Create By
						var modifyBy = "Panji";
						console.log(modifyBy);
						
						// Proses Ubah JSON
						var categoryDto = JSON.stringify({
							"initial" : initial,
							"name" : name,
							"active" : active,
							"modify_by" : modifyBy,
							"id" : id,
							"category_id" : categoryName
						});
						//Ambil ID
						
						// Panggil API
						var response = editVariantApi(categoryDto).responseJSON;
						if(response.code == 200){
							alert(response.message);
							$(".modal").modal("hide");
							refreshList();
						}else{
							alert(response.message);
						}
							
					});
					
					// Menampilkan Class Modal
					$(".modal").modal("show");
				}