		//--------------EDIT Variant

		function editVariantApi(variantDTO) {
			return $.ajax({
				url: "/api/variant/update",
				method: "PUT",
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

		function bukaPopupEdit(initial, name, active, id, category_name,category_id) {
			console.log(id +" "+category_id+" "+ category_name+" "+initial + " " + name + " " + active)
			
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
			$(".modal-title").html("Edit")

			//Ngisi Modal body
			$(".modal-body").html(
				`
			<table class="table table-borderless">
			<tr>
					<td>Category</td>
					<td > 
					<select id="input-category" class="form-control">
						<option value=${category_id} disable selected hidden>${category_name}</option>
						${html}
    				</select>
                    </td>
				</tr>
				<tr>
					<td>Initial</td>
					<td><input id="input-initial" class="form-control" value="${initial}"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input id="input-name" class="form-control" value="${name}"></td>	
				</tr>
				<tr>
					<td>Active</td>
					<td><input id="input-active" type="checkbox"  ${active == true ? 'checked' : ''}></td>	
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

			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			})

			$("#input-save").click(function () {
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

				//Ambil modify by
				var modifyBy = "Imam"
				console.log(modifyBy);
				
				//Ambil category id
				var categoryId = $("#input-category").val();
				console.log(categoryId);

				//Proses Membuat Json JSON
				var variantDTO = JSON.stringify({
					"initial": initial,
					"name": name,
					"active": active,
					"modify_by": modifyBy,
					"id": id,
					"category_id":categoryId
				});


				//Panggil API Insert
				var response = editVariantApi(variantDTO).responseJSON;
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