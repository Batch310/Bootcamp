function insertCategoryApi(categoryDTO) {
	return $.ajax({
		url: "/api/category/insert",
		method: "POST",
		data: categoryDTO,
		contentType: "application/json",
		async: false
	});
}
function bukaPopupAdd() {
	console.log("Add Category Kepencet!")


	// Ganti title
	$(".modal-title").html("Add Category");

	//ngisi Modal Bodynya
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
	})

	$("#input-create").click(function() {
		//ambil initial
		var initial = $("#input-initial").val();
		console.log(initial);
		//ambil name
		var name = $("#input-name").val();
		console.log(name);
		//ambil active
		var active = $("#input-active").prop("checked");
		console.log(active);
		//ambil by
		var createBy = "Tyan";
		console.log(createBy);

		//proses membuat JSON
		var categoryDTO = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy
		});

		// panggil API Insert
		var response = insertCategoryApi(categoryDTO).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(response.message);
		}

	})

	//.class
	//# id
	$(".modal").modal("show");
}