//-----------------------DELETE---------------------------
		
		function deleteCategoriesApi(categoryId){
			var formData = new FormData();
			formData.append("id",categoryId);
			
			return $.ajax({
				url : "/api/category/delete",
				method : "DELETE",
				data : formData,
				contentType : false,
				processData : false,
				mimeType : "multipart/form-data",
				async : false
			});
		}
		
		function deletePopUp(initial,name,active,id){
			console.log("Delete Clicked")
			console.log(initial+" "+name+" "+active)
			// Ganti Title
			$(".modal-title").html("Delete");
			
			// Isi Modal Body
			$(".modal-body").html(
				`
				<table class="table table-borderless">
				<h5>Apakah Anda ingin menghapus data ini?</h5>
					<tr>
						<td>Initial</td>
						<td> ${initial}</td>			
					</tr>
					<tr>
						<td>Name</td>
						<td> ${name}</td>		
					</tr>
					<tr>
						<td>Active</td>
						<td>
							<input type="checkbox" disabled ${active == true ? 'checked' : ''}>
						</td>			
					</tr>
					<tr>
						<td></td>
						<td>
							<button id="input-cancel" type="button" class="btn btn-light">Cancel</button>
							<button id="input-delete" type="button" class="btn btn-danger">Delete</button>
						</td>
								
					</tr>
				</table>
				`
			);
			
			$("#input-cancel").click(function(){
				$(".modal").modal("hide");
			});
			
			$("#input-delete").click(function(){
				var response = deleteCategoriesApi(id).responseText; //Ambil responsText
				var responseJson = $.parseJSON(response); //Convert ke JSON
				if(responseJson.code == 200){
					alert(responseJson.message);
					$(".modal").modal("hide");
					refreshList();
				}else{
					alert(responseJson.message);
				}
			});
			
			// Menampilkan Class Modal
			$(".modal").modal("show");
		
		}