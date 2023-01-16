//--------------------Insert Categoriy ---------------------
function insertVariantApi(categoryDto) {
	return $.ajax({
		url: "/api/variant/insert",
		method: "POST",
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

function bukaPopupAdd() {
	console.log("Add Category Kepencet!")

	//Ambil Isi dari dropdown
	var catResponse = getAllCategoriesApi().responseJSON.data;
	console.log(catResponse);
	var html = "";
	
	for (i = 0; i < catResponse.length; i++) {
		console.log(catResponse[i]);
		html += `<option value=${catResponse[i].id}>${catResponse[i].name}</option>`
	}



	//Ganti Title
	$(".modal-title").html("Create New");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
			<tr>
				<td>Category</td>
				<td>
					<select id="input-category">
						${html}
					</select>
				</td>
			</tr>
			<tr>
				<td>Initial</td>
				<td>
					<input id="input-initial" class="form-control">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input id="input-name" class="form-control">
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<input id="input-active" type="checkbox">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-create" class="btn btn-warning">Create</button>
				</td>
			</tr>
		</table>
		`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-create").click(function() {
		//Ambil Category Id
		var catId = $("#input-category").val();
		console.log(catId);
		
		//Ambil Initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#input-name").val();
		console.log(name);

		//Ambil Active
		var active = $("#input-active").prop("checked");
		console.log(active);

		//Create By
		var createBy = "Yuhan";
		console.log(createBy);

		//Proses Membuat Json JSON
		var categoryDto = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy,
			"category_id":catId
		});

		//Panggil API Insert
		var response = insertVariantApi(categoryDto).responseJSON;
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
//-------------------------------------------------------------