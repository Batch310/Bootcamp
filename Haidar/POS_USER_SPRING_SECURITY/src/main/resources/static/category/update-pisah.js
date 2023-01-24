//-----------------EDIT CATEGORY ------------------------

function editCategoryApi(categoryDto) {
	return $.ajax({
		url: "/api/category/update",
		method: "PUT",
		data: categoryDto,
		contentType: "application/json",
		async: false
	});
}

function bukaPopupEdit(initial, name, active, id) {
	console.log("Edit Category Kepencet!");
	console.log(initial + " " + name + " " + active + " " + id);


	//Ganti Title
	$(".modal-title").html("Edit");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
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

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-save").click(function() {
		//Ambil Initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#input-name").val();
		console.log(name);

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
			"id": id
		});

		//Panggil API Edit
		var response = editCategoryApi(categoryDto).responseJSON;
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