//============================================= INSERT CATEGORY =============================================
function insertCategoryAPI(categoryDTO) {
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

	$(".modal-title").html("Create New");

	//Ngisi modal body
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right">
						Initial
					</td>
					<td style="text-align: left">
						<input id="input-initial" class="form-control">
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						Name
					</td>
					<td style="text-align: left">
						<input id="input-name" class="form-control">
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						Active
					</td>
					<td style="text-align: left">
						<input id="input-active" type="checkbox">
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button type="button" id="input-cancel" class="btn btn-light">Cancel</button> <!--  data-dismiss="modal". Hanya bisa close, tidak bisa kalau ada logic bussiness nya-->
						<button type="button" id="input-create" class="btn btn-success">Create</button>
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

		//Ambil Create By
		var createBy = "Haidar";
		console.log(createBy);

		//Proses Ubah JSON
		var categoryDTO = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy,
		});

		//Panggil API INSERT
		var response = insertCategoryAPI(categoryDTO).responseJSON;
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