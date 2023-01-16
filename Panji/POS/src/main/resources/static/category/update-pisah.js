//-------EDIT--------
		function editCategoriesApi(categoryDTO){
			return $.ajax({
				url : "/api/category/update",
				method : "PUT",
				data : categoryDTO,
				contentType : "application/json",
				async : false
			});
		}
		
		
		function bukaPopupEdit(initial,name,active,id){
			console.log("Add Edit Clicked")
			console.log(initial+" "+name+" "+active+""+id)
			// Ganti Title
			$(".modal-title").html("Edit");
			
			// Isi Modal Body
			$(".modal-body").html(
				`
				<table class="table table-borderless">
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
					"id" : id
				});
				//Ambil ID
				
				// Panggil API
				var response = editCategoriesApi(categoryDto).responseJSON;
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
		
		//-------------------------------------------------------------------------------