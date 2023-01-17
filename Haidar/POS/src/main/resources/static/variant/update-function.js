//============================================= EDIT CATEGORY =============================================
function editVariantAPI(categoryDTO) {
	return $.ajax({
		url: "/api/variant/update",
		method: "PUT",
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

function bukaPopupEdit(initial, name, active, category_name, category_id, id) {
	console.log("Edit Variant Kepencet!");
	console.log(initial + " " + name + " " + active + " " + category_name + " " + category_id + " " + id);
	
	var catList = getAllCategoriesAPI().responseJSON.data;
	console.log(catList);
	
	var htmlOption = "";
	
	for (i = 0; i < catList.length; i++) {
		//console.log(catList[i]);
		htmlOption += `<option value="${catList[i].id}" ${category_id == catList[i].id ? 'selected' : ''}>${catList[i].name}</option>`;
	}
	
	
	

	$(".modal-title").html("Edit");
	//. untuk class
	//# untuk id
	$(".modal").modal("show");
	//Ngisi modal body
	$(".modal-body").html(
		`
			<table class="table table-borderless">
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Category</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<select id="edit-categoryId" class="form-control">
							<!--option value="${category_id}" selected hidden-->${category_name}<!--/option-->
  							${htmlOption}
						</select>
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Initial</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="edit-initial" class="form-control" value="${initial}">
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Name</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="edit-name" class="form-control" value="${name}">
					</td>
				</tr>
				<tr>
					<td style="text-align: right; vertical-align: middle">
						<b>Active</b>
					</td>
					<td style="text-align: left; vertical-align: middle">
						<input id="edit-active" type="checkbox" style="accent-color: #DBDBDB" ${active == true ? 'checked' : ''}>
					</td>
				</tr>
				<tr>
					<td></td>
					<td style="text-align: left">
						<button id="edit-cancel" type="button" class="btn btn-light">Cancel</button>
						<button id="edit-save" type="button" class="btn btn-warning">Save Change</button>
					</td>
				</tr>			
		</table>
		`
	);

	$("#edit-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#edit-save").click(function() {
		//Ambil category_id
		var categoryId = $("#edit-categoryId").val();
		console.log(categoryId);
		
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
		var variantDTO = JSON.stringify({
			"category_id": categoryId,
			"initial": initial,
			"name": name,
			"active": active,
			"modify_by": modifyBy,
			"id": id
		});
		console.log(variantDTO);

		//Panggil API EDIT
		var response = editVariantAPI(variantDTO).responseJSON;
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