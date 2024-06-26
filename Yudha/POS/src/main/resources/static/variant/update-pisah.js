//-----------------------------------------------------------------------------EDIT-------------------------------------------------------------
		function getAllCategoriesApi(){
			return $.ajax({
				url : "/api/category/get",
				method : "GET",
				async : false
				
			});
		}
		
		function editVariantApi(variantDto){
			return $.ajax({
				url : "/api/variant/update",
				method : "PUT",
				data : variantDto,
				contentType : "application/json",
				async : false
				
			});
		}
		
		
		
		function bukaPopupEdit(category_name,initial,name,active,category_id,id){
			
			console.log("Update Variant clicked")
			console.log(initial + " " + name + " " + active )
			
			var catResponse = getAllCategoriesApi().responseJSON.data;
			
			console.log(catResponse);
			
			var html="";
			
			for(i=0;i<catResponse.length;i++){
				console.log(catResponse[i]);
				html += `<option value=${catResponse[i].id} ${catResponse[i].id==category_id ? "selected":""}>${catResponse[i].name}</option>`
			}
			
			//Ganti Title
			$(".modal-title").html("Edit")
			
			//Ngisi Modal Bodynya
			$(".modal-body").html(
				`
				<table class = "table table-borderless">
				
					<tr>
						<td>Category</td>
						<td>
							<select id="input-category" class="form-control">
								${html}
							</select>
						</td>
					</tr>
					<tr>
						<td>Initial</td>
						<td><input id="input-initial" class="form-control" value="${initial}"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input id="input-name" class="form-control" value="${name}"></td>
					</tr>
					<tr>
						<td>Active</td>
						<td><input id="input-active" type="checkbox" ${active == true ? 'checked' : ''}></td>
					</tr>
					<tr>
						<td></td>
						<td>
							<button id="input-cancel" class="btn btn-light">Cancel</button>
							<button id="input-save" class="btn btn-warning">Save Change</button>
						</td>
					</tr>
				</table>
				`
			);
			
			$("#input-cancel").click(function(){
				$(".modal").modal("hide");
			})
			
			$("#input-save").click(function(){
				var category_id = $("#input-category").val();
				console.log(category_id);
				
				var initial = $("#input-initial").val();
				console.log(initial);
				
				var name = $("#input-name").val();
				console.log(name);
				
				var active = $("#input-active").prop("checked");
				console.log(active);
				
				var modifyBy = "yudhaykw";
				console.log(modifyBy)
				
				// ambil JSON
				var variantDto = JSON.stringify({
					"category_id" : category_id,
					"initial" : initial,
					"name" : name,
					"active" : active,
					"modify_by" : modifyBy,
					"id" : id
				});
				
				// panggil API
				var response = editVariantApi(variantDto).responseJSON;
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
		