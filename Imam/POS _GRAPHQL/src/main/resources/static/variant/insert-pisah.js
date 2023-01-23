//---------- ISERT CATEGORIES------------------------------

function insertVariantApi(variantDTO) {
	return $.ajax({
		url: "/api/variant/insert",
		method: "POST",
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

function bukaPopupAdd() {

	//Ambilo isi dropdown
	var catResponse = getAllCategoriesApi().responseJSON.data;    //Manggil semua data
	console.log(catResponse);

	var html ="";
	//---------- isi select category------------------------------

	for (i = 0; i < catResponse.length; i++) {
		console.log(catResponse[i]);
		html += `<option value=${catResponse[i].id}>${catResponse[i].name}</option>`
	}

	//Ganti title
	$(".modal-title").html("Add Variant")

	//Ngisi Modal body
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td>Category</td>
					<td > 
					<select id="input-category" class="form-control">
						${html}
    				</select>
                    </td>
				</tr>
				<tr>
					<td>Initial</td>
					<td><input id="input-initial" class="form-control"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input id="input-name"  class="form-control"></td>	
				</tr>
				<tr>
					<td>Active</td>
					<td><input id="input-active"  type="checkbox"></td>	
				</tr>
				<tr>
					<td></td>
					<td>
						<button id="input-cancel" class="btn btn-light">Cancel</button>
						<button id="input-create"class="btn btn-success">Create</button>
					</td>
				</tr>
			</table>
			`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	})

	$("#input-create").click(function() {
		$(".modal").modal("hide");
		//Ambil initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil name
		var name = $("#input-name").val();
		console.log(name);

		//Ambil active	
		var active = $("#input-active").prop("checked");
		console.log(active);

		//Ambil create by
		var createBy = "Imam"
		console.log(createBy);
		
		//Ambil select category
		var categoryName = $("#input-category").val();
		console.log(categoryName);


		//Proses Membuat Json JSON
		var variantDTO = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy,
			"category_id": categoryName,
		});


		//Panggil API Insert
		var response = insertVariantApi(variantDTO).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide"); //ditutup
			refreshList();
		} else {
			alert(response.message);
		}
	});

	// . => class
	// # => id

	$(".modal").modal("show");
}