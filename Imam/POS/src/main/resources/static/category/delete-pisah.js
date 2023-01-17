//---------------------DELETE---------------------------------

		function deleteCategoryApi(categoryId) {
			var formData = new FormData();
			formData.append("id", categoryId);

			return $.ajax({
				url: "/api/category/delete",
				method: "DELETE",
				data: formData,
				contentType: false,
				processData: false,
				mimeType: "multipart/form-data",
				async: false

			});
		}

		function bukaPopupHapus(initial, name, active, id) {
			console.log(initial + " " + name + " " + active + " " + id)
			//Ganti title
			$(".modal-title").html("Hapus")

			//Ngisi Modal body
			$(".modal-body").html(
				`
			<h5> Are you sure you want to delete this?</h5>
			<table class="table table-borderless">
				
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
					<td><input type="checkbox" ${active == true ? 'checked' : ''} disabled></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button id="input-cancel" class="btn btn-light">Cancel</button>
						<button id="input-delete" class="btn btn-danger">Delete</button>
					</td>
				</tr>
			</table>
			`
			);

			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			});

			$("#input-delete").click(function () {
				
				//Ambil response Text
				var response = deleteCategoryApi(id).responseText;
				//Convert ke JSON
				var responseJson = $.parseJSON(response);
				console.log(response);
				
					if (responseJson.code == 200) {
					alert(responseJson.message);
					$(".modal").modal("hide"); //ditutup
					refreshList();
				} else {
					alert(responseJson.message);
				}

			});



			// . => class
			// # => id

			$(".modal").modal("show");
		}