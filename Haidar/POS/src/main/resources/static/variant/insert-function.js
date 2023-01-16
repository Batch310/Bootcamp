//============================================= INSERT CATEGORY =============================================
function insertVariantsAPI(categoryDTO) {
	return $.ajax({
		url: "/api/variant/insert",
		method: "POST",
		data: categoryDTO,
		contentType: "application/json",
		async: false
	});
}

function getAllCategoriesAPI() {
	return $.ajax({
		url: "/api/category/get",
		method: "GET",
		async: false
	});
}

function bukaPopupAdd() {
	console.log("Add Variant Kepencet!");

	$(".modal-title").html("Create New");
	//. untuk class
	//# untuk id
	$(".modal").modal("show");
	
	var catList = getAllCategoriesAPI().responseJSON.data;
	console.log(catList);
	
	var htmlOption = "";

	//Ambil category
	for (i = 0; i < catList.length; i++) {
		console.log(catList[i]);
		htmlOption += `<option value="${catList[i].id}">${catList[i].name}</option>`;
	}
	
	//Ngisi modal body
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Category</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<select id="input-categoryId" class="form-control">
							<option selected hidden>Select Category</option>
							${htmlOption}
						</select>
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Initial</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="input-initial" class="form-control">
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Name</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="input-name" class="form-control">
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Active</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="input-active" type="checkbox" style="accent-color: #DBDBDB">
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button type="button" id="input-cancel" class="btn btn-light">Cancel</button>
						<button type="button" id="input-create"  class="btn btn-success">Create</button>
					</td>
				</tr>			
		</table>
		`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-create").click(function() {
		//Ambil categoryId
		var categoryId = $("#input-categoryId").val();
		console.log(categoryId);
		
		//Ambil Initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#input-name").val();
		console.log(name);

		//Ambil Active
		var active = $("#input-active").prop("checked");
		console.log(active);

		//Ambil Create By
		var createBy = "Haidar";
		console.log(createBy);

		//Proses Ubah JSON
		var categoryDTO = JSON.stringify({
			"category_id": categoryId,
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy
		});

		//Panggil API INSERT
		var response = insertVariantsAPI(categoryDTO).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(response.message);
		}

	});

	//. untuk class
	//# untuk id
	$(".modal").modal("show");
}

		//============================================= INSERT CATEGORY =============================================