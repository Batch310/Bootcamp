function editVariantApi(variantDTO) {
	return $.ajax({
		url: "/api/variant/update",
		method: "PUT",
		data: variantDTO,
		contentType: "application/json",
		async: false
	});
}
function getAllCategoriesApi() {
	return $.ajax({
		url: "/api/category/get",
		method: "GET",
		async: false

	});
}


function bukaPopupEdit(category, initial, name, active, id, category_id) {

	//ambil isi dari dropdown
	var catResponse = getAllCategoriesApi().responseJSON.data;
	console.log(catResponse);
	var html = "";


	for (i = 0; i < catResponse.length; i++) {
		html += `<option value = "${catResponse[i].id}" ${category_id == catResponse[i].id ? 'selected' : ''}>${catResponse[i].name}</option>`
	}

	console.log("Edit Variant Kepencet!")
	console.log(category + " " + initial + " " + name + " " + active + " " + id + " " + category_id)

	// Ganti title
	$(".modal-title").html("Edit");

	//ngisi Modal Bodynya
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td>Category</td>
					<td><select id="edit-category" class="form-control">
							${html}
						</select>
					</td>
				</tr>
				<tr>
					<td>Initial</td>
					<td>
						<input id="edit-initial" class="form-control" value="${initial}">
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>
						<input id="edit-name" class="form-control" value="${name}">
					</td>
				</tr>
				<tr>
					<td>Active</td>
					<td>
						<input id="edit-active" type="checkbox" ${active == true ? 'checked' : ''}>	
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button id="edit-cancel" class="btn btn-light">Cancel</button>
						<button id="edit-save" class="btn btn-warning">Save Change</button>	
					</td>
				</tr>
			</table>

		`
	)
	$("#edit-cancel").click(function() {
		$(".modal").modal("hide");
	})

	$("#edit-save").click(function() {
		//ambil categoryId
		var categoryId = $("#edit-category").val();
		console.log(categoryId);
		//ambil initial
		var initial = $("#edit-initial").val();
		console.log(initial);
		//ambil name
		var name = $("#edit-name").val();
		console.log(name);
		//ambil active
		var active = $("#edit-active").prop("checked");
		console.log(active);
		//ambil by
		var modifyBy = "Tyan";
		console.log(modifyBy);

		//proses membuat JSON
		var variantDTO = JSON.stringify({
			"category_id": categoryId,
			"initial": initial,
			"name": name,
			"active": active,
			"modify_by": modifyBy,
			"id": id

		});
		console.log(variantDTO);

		// panggil API Edit
		var response = editVariantApi(variantDTO).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(response.message);
		}

	})

	//.class
	//# id
	$(".modal").modal("show");
}
