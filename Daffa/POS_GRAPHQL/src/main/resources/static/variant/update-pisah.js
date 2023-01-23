//-----EDIT VARIANT-----
		function getAllCategoriesAPI() {
			return $.ajax({
				url: "/api/category/get",
				method: "GET",
				async: false
			});
		}
		function editVariantAPI(variantDto) {
			return $.ajax({
				url: "/api/variant/update",
				method: "PUT",
				data: variantDto,
				contentType: "application/json",
				async: false
			});
		}
		function bukaPopupEdit(initial, name, active, id, category_name, category_id) {
			console.log("Edit Variant Clicked!")
			
			var categoryResponse = getAllCategoriesAPI().responseJSON.data;
			console.log(categoryResponse);

			var html = "";

			for (i = 0; i < categoryResponse.length; i++) {
				html += `<option value="${categoryResponse[i].id}" ${categoryResponse[i].id == category_id ? 'selected' : ''}>${categoryResponse[i].name}</option>`
			}
			//Ganti title
			$(".modal-title").html("Edit Variant");

			//Ganti Modal Body
			$(".modal-body").html(
				`
				<table class="table table borderless">
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
							<button id="input-cancel" type="button" class="btn btn-light">Cancel</button>
							<button id="input-save" type="button" class="btn btn-success">Save Change</button>
						</td>
					</tr>
				</table>
				`
			)
			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			});

			$("#input-save").click(function () {
				//Ambil Category name
				var categoryId = $("#input-category").val();
				console.log(categoryId);

				//Ambil initial
				var initial = $("#input-initial").val();
				console.log(initial);

				//Ambil name
				var name = $("#input-name").val();
				console.log(name);

				//Ambil active
				var active = $("#input-active").prop("checked");
				console.log(active);

				//Create By
				var modifyBy = "Jambrong";
				console.log(modifyBy);

				//Proses Ubah JSON
				var variantDto = JSON.stringify({
					"id": id,
					"category_id": categoryId,
					"initial": initial,
					"name": name,
					"active": active,
					"modify_by": modifyBy
				});
				console.log(variantDto);
				//Panggil API Insert
				var response = editVariantAPI(variantDto).responseJSON;
				if (response.code == 200) {
					alert(response.message);
					$(".modal").modal("hide");
					refreshList();
				} else {
					alert(response.message);
				}

			})

			//. class
			//# id
			$(".modal").modal("show");
		}