//============================================= EDIT CATEGORY =============================================
function editCategoryAPI(categoryDTO) {
	return $.ajax({
		url: "/api/category/update",
		method: "PUT",
		data: categoryDTO,
		contentType: "application/json",
		async: false
	});
}

function bukaPopupEdit(initial, name, active, id) {
	console.log("Edit Category Kepencet!")
	console.log(initial + " " + name + " " + active + " " + id)

	$(".modal-title").html("Edit");

	//Ngisi modal body
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right">
						<b>Initial</b>
					</td>
					<td style="text-align: left">
						<input id="edit-initial" class="form-control" value="${initial}">
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						<b>Name</b>
					</td>
					<td style="text-align: left">
						<input id="edit-name" class="form-control" value="${name}">
					</td>
				</tr>
				<tr>
					<td style="text-align: right">
						<b>Active</b>
					</td>
					<td style="text-align: left">
						<input id="edit-active" type="checkbox" style="accent-color: #DBDBDB" ${active == true ? 'checked' : ''}>
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button type="button" id="edit-cancel" class="btn btn-light">Cancel</button>
						<button type="button" id="edit-save" class="btn btn-warning">Save Change</button>
					</td>
				</tr>			
		</table>
		`
	);

	$("#edit-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#edit-save").click(function() {
		//Ambil Initial
		var initial = $("#edit-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#edit-name").val();
		console.log(name);

		//Ambil Active
		var active = $("#edit-active").prop("checked");
		console.log(active);

		//Ambil Modify By
		var modifyBy = "Haidar";
		console.log(modifyBy);

		//Proses Ubah JSON
		var categoryDTO = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"modify_by": modifyBy,
			"id": id
		});

		//Panggil API EDIT
		var response = editCategoryAPI(categoryDTO).responseJSON;
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
		//============================================= EDIT CATEGORY =============================================