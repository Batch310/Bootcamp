//--------------------Insert Categoriy ---------------------
function insertCategoryApi(categoryDto) {
	return $.ajax({
		url: "/api/category/insert",
		method: "POST",
		data: categoryDto,
		contentType: "application/json",
		async: false
	});
}

function bukaPopupAdd() {
	console.log("Add Category Kepencet!")

	//Ganti Title
	$(".modal-title").html("Create New");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
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
		var createBy = wrtrwrr;
		console.log(createBy);

		//Proses Membuat Json JSON
		var categoryDto = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy
		});

		//Panggil API Insert
		var response = insertCategoryApi(categoryDto).responseJSON;
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