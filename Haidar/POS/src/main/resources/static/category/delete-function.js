//============================================= DELETE CATEGORY =============================================
function deleteCategoryAPI(categoryId) {
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

function bukaPopupDelete(initial, name, active, id) {
	console.log("Delete Category Kepencet!")
	console.log(initial + " " + name + " " + active + " " + id)

	$(".modal-title").html("Delete");
	//Ngisi modal body
	$(".modal-body").html(
		`
			<h5>Are you sure you want to delete this?</h5>
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right">
						<b>Initial</b>
					</td>
					<td style="text-align: left">
						${initial}
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						<b>Name</b>
					</td>
					<td style="text-align: left">
						${name}
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						<b>Active</b>
					</td>
					<td style="text-align: left">
						<input type="checkbox" ${active == true ? 'checked' : ''} disabled>
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button type="button" id="delete-cancel" class="btn btn-light">Cancel</button>
						<button type="button" id="delete-confirm" class="btn btn-danger">Delete</button>
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
		var response = deleteCategoryAPI(id).responseText;
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