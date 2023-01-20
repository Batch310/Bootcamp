//-----------------EDIT CATEGORY ------------------------

function editProductApi(categoryDto) {
	return $.ajax({
		url: "/api/product/update",
		method: "PUT",
		data: categoryDto,
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

function getAllVariantsByCategoryIdApi(categoryId) {
	return $.ajax({
		url: "/api/variant/getByCategoryId?category_id=" + categoryId,
		method: "GET",
		async: false
	});
}

function getAllOptionVariantByCategoryId(catId, varId) {
	var varResponse = getAllVariantsByCategoryIdApi(catId).responseJSON.data;
	console.log(varResponse);
	var html = "";

	for (i = 0; i < varResponse.length; i++) {
		console.log(varResponse[i]);
		html += `<option value="${varResponse[i].id}" ${varId == varResponse[i].id ? 'selected' : ''}>${varResponse[i].name}</option>`
	}

	$("#input-variant").html(html);
}

function bukaPopupEdit(initial, name, active, id, categoryName, categoryId, variantName, variantId, description, price, stock) {
	console.log("Edit Category Kepencet!");
	console.log(initial + " " + name + " " + active + " " + id + " " + categoryName + " " + categoryId);


	//Ambil Isi dari dropdown
	var catResponse = getAllCategoriesApi().responseJSON.data;
	console.log(catResponse);
	var html = "";

	for (i = 0; i < catResponse.length; i++) {
		console.log(catResponse[i]);
		html += `<option value="${catResponse[i].id}" ${categoryId == catResponse[i].id ? 'selected' : ''}>
		${catResponse[i].name}</option>`
	}


	//Ganti Title
	$(".modal-title").html("Edit");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
		<tr>
				<td>Category</td>
				<td>
					<select id="input-category" onchange="getAllOptionVariantByCategoryId(this.value)" class="form-control">
						${html}
					</select>
				</td>
			</tr>
			<tr>
				<td>Variant</td>
				<td>
					<select id="input-variant" class="form-control">
					</select>
				</td>
			</tr>
			<tr>
				<td>Initial</td>
				<td>
					<input id="input-initial" class="form-control" value="${initial}">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input id="input-name" class="form-control" value="${name}">
				</td>
			</tr>
			<tr>
				<td>Description</td>
				<td>
					<input id="input-description" class="form-control" value="${description}">
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>
					<input id="input-price" class="form-control" value="${price}">
				</td>
			</tr>
			<tr>
				<td>Stock</td>
				<td>
					<input id="input-stock" class="form-control" value="${stock}">
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<input id="input-active" type="checkbox" ${active == true ? 'checked' : ''}>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-save" class="btn btn-warning">Save Change</button>
				</td>
			</tr>
		</table>
		`
	);

	//Set Default
	getAllOptionVariantByCategoryId(categoryId, variantId)


	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-save").click(function() {
		//Ambil Category Id
		var catId = $("#input-category").val();
		console.log(catId);
		
		//Ambil Variant Id
		var varId = $("#input-variant").val();
		console.log(varId);
		
		//Ambil Initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#input-name").val();
		console.log(name);
		
		//Ambil Description
		var description = $("#input-description").val();
		console.log(description);
		
		//Ambil Price
		var price = $("#input-price").val();
		console.log(price);
		
		//Ambil Stock
		var stock = $("#input-stock").val();
		console.log(stock);

		//Ambil Active
		var active = $("#input-active").prop("checked");
		console.log(active);

		//Modify By
		var modifyBy = userID;
		console.log(modifyBy);

		//Proses Membuat Json JSON
		var categoryDto = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"modify_by": modifyBy,
			"id": id,
			"category_id": catId,
			"description":description,
			"price":price,
			"stock":stock,
			"variant_id":varId
		});

		//Panggil API Edit
		var response = editProductApi(categoryDto).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(response.message);
		}
	});

	//. class
	//# id
	$(".modal").modal("show");


}
	//-----------------------------------------------------------