//------------------------------ DELETE --------------------
//--------------------------------------------------------
function deleteProductApi(categoryId) {
	var formData = new FormData();
	formData.append("id", categoryId);

	return $.ajax({
		url: "/api/product/delete",
		method: "DELETE",
		data: formData,
		contentType: false,
		processData: false,
		mimeType: "multipart/form-data",
		async: false
	});
}

function deleteUpdateProductApi(productDto) {

	return $.ajax({
		"url": "/api/product/updatedelete",
		"method": "PUT",
		data: productDto,
		contentType: "application/json",
		async: false
		});
}


function bukaPopupDelete(initial, name, active, id, category_name, variant_name, description, price, stock) {
	console.log("Delete Category Kepencet!")

	//Ganti Title
	$(".modal-title").html("Delete");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<h5>Are you sure you want to delete this?</h5>
		<table class="table table-borderless">
			<tr>
				<td>Category/Variant</td>
				<td>
					${variant_name}/${category_name}
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
				<td>Description</td>
				<td>
					${description}
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>
					${price}
				</td>
			</tr>
			<tr>
				<td>Stock</td>
				<td>
					${stock}
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
		var productDto = JSON.stringify({
			"id": id,
			"deleted_by": user_id,
			
		});

		//Convert ke Json
		var response = deleteUpdateProductApi(productDto).responseText;
		console.log(response);
		
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
