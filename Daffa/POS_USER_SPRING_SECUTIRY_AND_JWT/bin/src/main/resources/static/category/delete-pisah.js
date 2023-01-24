//------------------------------ DELETE --------------------
//--------------------------------------------------------
function deleteCategoryApi(categoryDto) {
	//var formData = new FormData();
	//formData.append("id", categoryId);

	return $.ajax({
		url: "/api/category/delete",
		method: "DELETE",
		data: categoryDto,
		contentType: "application/json",
		async: false
	});
}


function bukaPopupDelete(initial, name, active, id) {
	console.log("Delete Category Kepencet!")

	//Ganti Title
	$(".modal-title").html("Delete");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<h5>Are you sure you want to delete this?</h5>
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
		var categoryDto = JSON.stringify({
			"id": id,
			"deleted_by": user
		});
		
		var response = deleteCategoryApi(categoryDto).responseText;
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
