//---------------------------------------------DELETE----------------------------------------------------

		function deleteVariantApi(variantId) {
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
		
		function getAllCategoriesAPI() {
			return $.ajax({
				url: "/api/category/get",
				method: "GET",
				async: false
			});
		}

		function bukaPopupDelete(initial, name, active, id, category_name, category_id) {
			console.log("Delete Variant Clicked")


			var categoryResponse = getAllCategoriesAPI().responseJSON.data;
			console.log(categoryResponse);

			var html = "";

			for (i = 0; i < categoryResponse.length; i++) {
				html += `<option value="${categoryResponse[i].id}" ${categoryResponse[i].id == category_id ? 'selected' : ''}>${categoryResponse[i].name}</option>`
			}

			//Ganti title
			$(".modal-title").html("Delete");

			//isi modal body
			$(".modal-body").html(
				`
			<h5>Are you sure want to delete this ?</h5>
			<table class="table table-borderless">
			<tr>
						<td>Category</td>
						<td>
  							<select id="input-category" class="form-control" disabled>
							<option value="${category_id}" selected hidden>${category_name}</option>

    							${html}
  							</select>
						</td>
					</tr>
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
				<td><input id="input-active" disabled type="checkbox"  ${active == true ? 'checked' : ''}></td>
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
				
				var response = deleteVariantApi(id).responseText;
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