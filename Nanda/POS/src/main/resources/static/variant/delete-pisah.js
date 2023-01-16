//---------------------------------------------DELETE----------------------------------------------------

		function deleteCategoriesApi(variantId) {
			var formData = new FormData();
			formData.append("id", variantIdId);

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
			console.log("Delete Variant Clicked")

			//Ganti title
			$(".modal-title").html("Delete");

			//isi modal body
			$(".modal-body").html(
				`
			<h5>Are you sure want to delete this ?</h5>
			<table class="table table-borderless">
			<tr>
				<td>Initial</td>
				<td>
					${initial}
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					${name}
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td><input type="checkbox" disabled checked></td>
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
				//ambil response text
				
				var response = deleteCategoriesApi(id).responseText;
				console.log(response);
				//convert ke json
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