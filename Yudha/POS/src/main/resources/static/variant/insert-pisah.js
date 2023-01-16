//---------------------------------------------------------------------------Insert----------------------------------------------------
		function insertVariantsApi(variantDto){
			return $.ajax({
				url : "/api/variant/insert",
				method : "POST",
				data : variantDto,
				contentType : "application/json",
				async : false
				
			});
		}
		
		function getAllCategoriesApi(){
			return $.ajax({
				url : "/api/category/get",
				method : "GET",
				async : false
				
			});
		}
		
		function bukaPopupAdd(){
			console.log("Add Variant clicked")
			
			var catResponse = getAllCategoriesApi().responseJSON.data;
			
			console.log(catResponse);
			
			var html="";
			
			for(i=0;i<catResponse.length;i++){
				console.log(catResponse[i]);
				html += `<option value=${catResponse[i].id}>${catResponse[i].name}</option>`
			}
			
			//Ganti Title
			$(".modal-title").html("Create New")
			
			//Ngisi Modal Bodynya
			$(".modal-body").html(
				`
				<table class = "table table-borderless">
					<tr>
						<td>Category</td>
						<td>
							<select id="input-category" class="form-control">
								<option disabled selected hidden>Select Category</option>
								${html}
							</select>
						</td>
					</tr>
					<tr>
						<td>Initial</td>
						<td><input id="input-initial" class="form-control"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input id="input-name" class="form-control"></td>
					</tr>
					<tr>
						<td>Active</td>
						<td><input id="input-active" type="checkbox"></td>
					</tr>
					<tr>
						<td></td>
						<td>
							<button id="input-cancel" class="btn btn-light">Cancel</button>
							<button id="input-create" class="btn btn-warning">Create</button>
						</td>
					</tr>
				</table>
				`
			);
			
			$("#input-cancel").click(function(){
				$(".modal").modal("hide");
			})
			
			$("#input-create").click(function(){
				var category_id = $("#input-category").val();
				console.log(category_id);
				
				var initial = $("#input-initial").val();
				console.log(initial);
				
				var name = $("#input-name").val();
				console.log(name);
				
				var active = $("#input-active").prop("checked");
				console.log(active);
				
				var createBy = "yykw";
				console.log(createBy)
				
				// ambil JSON
				var variantDto = JSON.stringify({
					"category_id" : category_id,
					"initial" : initial,
					"name" : name,
					"active" : active,
					"create_by" : createBy
				});
				
				// panggil API
				var response = insertVariantsApi(variantDto).responseJSON;
				if(response.code == 200){
					alert(response.message);
					$(".modal").modal("hide");
					refreshList();
				}else{
					alert(response.message)
				}
				
			});
			
			$(".modal").modal("show");
			
		}