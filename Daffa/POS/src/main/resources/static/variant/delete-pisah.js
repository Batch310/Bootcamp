//-----DELETE-----
		function deleteVariantAPI(variantId) {
			var formData = new FormData();
			formData.append("id", variantId);

			return $.ajax({
				url: "/api/variant/delete",
				method: "DELETE",
				data: formData,
				contentType: false,
				processData: false,
				mimeType: "multipart/form-data",
				async: false
			});
		}
		function bukaPopupDelete(initial, name, active, id) {
			console.log("Delete Variant Clicked!")
			console.log(initial + " " + name + " " + active + " " + id)

			//Ganti title
			$(".modal-title").html("Delete Variant");

			//Ganti Modal Body
			$(".modal-body").html(
				`
				<h5>Are you sure want to delete this?</h5>
				<table class="table table borderless">
					<tr>
						<td>Initial</td>
						<td><input class="form-control" id="disabledInput" type="text" placeholder="${initial}"" disabled></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input class="form-control" id="disabledInput" type="text" placeholder="${name}" disabled></td>
					</tr>
					<tr>
						<td>Active</td>
						<td><input type="checkbox" disabled ${active == true ? 'checked' : ''}></td>
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

			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			});

			$("#input-delete").click(function () {
				//Ambil responseText
				var response = deleteVariantAPI(id).responseText;
				console.log(response);

				//Convert ke JSON
				var responseJson = $.parseJSON(response);

				if (responseJson.code == 200) {
					alert(responseJson.message);
					$(".modal").modal("hide");
					refreshList();
				} else {
					alert(responseJson.message);
				}
			});

			//. class
			//# id
			$(".modal").modal("show");
		}