//----------------------------------------------delete-----------------------------------------------------------------
		
		function deleteVariantApi(variantId){
			var formData = new FormData();
			formData.append("id",variantId);
			
			return $.ajax({
				url : "/api/variant/delete",
				method : "DELETE",
				data : formData,
				contentType : false,
				processData : false,
				mimeType : "multipart/form-data",
				async : false
				
			});
		}
		
		function bukaPopupDelete(category_name,initial,name,active,category_id,id){
			console.log("Delete Category clicked")
			console.log(initial + " " + name + " " + active )
			//Ganti Title
			$(".modal-title").html("Delete")
			
			//Ngisi Modal Bodynya
			$(".modal-body").html(
				`
				<h5>Are you sure you want to delete this?</h5>
				<table class = "table table-borderless">
					<tr>
						<td>Category</td>
						<td>${category_name}</td>
					</tr>
					<tr>
						<td>Initial</td>
						<td>${initial}</td>
					</tr>
					<tr>
						<td>Name</td>
						<td>${name}</td>
					</tr>
					<tr>
						<td>Active</td>
						<td><input  type="checkbox" disabled ${active == true ? 'checked' : ''}></td>
					</tr>
					<tr>
						<td></td>
						<td>
							<button id="input-cancel"  class="btn btn-light">Cancel</button>
							<button id="input-delete" class="btn btn-danger">Delete</button>
						</td>
					</tr>
				</table>
				`
			);
			
			$("#input-cancel").click(function(){
				$(".modal").modal("hide");
			})
			
			$("#input-delete").click(function(){
				//ambil response text
				var response = deleteVariantApi(id).responseText;
				console.log(response);
				
				//convert ke Json
				var responseJson = $.parseJSON(response);
				
				if(responseJson.code == 200){
					alert(responseJson.message);
					$(".modal").modal("hide");
					refreshList();
				}else{
					alert(responseJson.message)
				}
				
			})
			
			$(".modal").modal("show");
			
		}
		