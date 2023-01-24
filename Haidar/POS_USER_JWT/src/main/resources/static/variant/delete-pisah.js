//------------------------------ DELETE --------------------
//--------------------------------------------------------
function deleteVariantApi(categoryId) {
	var formData = new FormData();
	formData.append("id", categoryId);

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

function deleteVariantByIsDeleteApi(variantId) {
	var form = new FormData();
	form.append("user_id", userID);
	form.append("id", variantId);
	
	return $.ajax({
		"url": "/api/variant/deleted",
		"method": "PUT",
		"processData": false,
		"mimeType": "multipart/form-data",
		"contentType": false,
		"data": form,
		"async": false
	})
}

function bukaPopupDelete(initial, name, active, id, category_name) {
	console.log("Delete Category Kepencet!")

	//Ganti Title
	$(".modal-title").html("Delete");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<h5>Are you sure you want to delete this?</h5>
		<table class="table table-borderless">
			<tr>
				<td>Category</td>
				<td>
					${category_name}
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
				<td>
					<input type="checkbox" disabled ${active == true ? 'checked' : ''}>
				</td>
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

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-delete").click(function() {
		//Ambil Response Text
		var response = deleteVariantByIsDeleteApi(id).responseText;
		console.log(response);

		//Convert ke Json
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
//---------------------------------------------------------------------
