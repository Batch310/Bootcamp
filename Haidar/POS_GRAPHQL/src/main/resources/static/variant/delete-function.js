//============================================= DELETE CATEGORY =============================================
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

function bukaPopupDelete(category_name, initial, name, active, id) {
	console.log("Delete Variant Kepencet!")
	console.log(category_name + " " + initial + " " + name + " " + active + " " + id)

	$(".modal-title").html("Delete");
	//. untuk class
	//# untuk id
	$(".modal").modal("show");
	//Ngisi modal body
	$(".modal-body").html(
		`
			<h5>Are you sure you want to delete this?</h5>
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Category</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
    					${category_name}  							
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Initial</b>
					</td>
					<td id="delete-initial" style="text-align: left; vertical-align: middle">
						${initial}
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Name</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						${name}
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Active</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input type="checkbox" ${active == true ? 'checked' : ''} disabled>
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button id="delete-cancel" type="button" class="btn btn-light">Cancel</button>
						<button id="delete-confirm" type="button" class="btn btn-danger">Delete</button>
					</td>
				</tr>			
		</table>
		`
	);

	$("#delete-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#delete-confirm").click(function() {
		//Ambil responseText
		var response = deleteVariantAPI(id).responseText;
		console.log(response);

		//Convert to JSON
		var responseJson = $.parseJSON(response);

		if (responseJson.code == 200) {
			alert(responseJson.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(responseJson.message);
		}
	});

	//. untuk class
	//# untuk id
	$(".modal").modal("show");
}
		//============================================= DELETE CATEGORY =============================================