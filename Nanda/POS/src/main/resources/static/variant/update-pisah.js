//------------------------------------------------EDIT------------------------
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
		
		function bukaPopupEdit(initial, name, active, id, category_name, category_id) {
			console.log("Edit Variant Clicked");
			console.log(id + " " +category_id + " " + category_name +" " +initial+ " "+name+ " " +active)
			
			//Ganti title
			$(".modal-title").html("Edit");
			
			var catResponse = getAllCategoriesApi().responseJSON.data;
			console.log(catResponse);
			var html = "";
			
			for (i = 0; i < catResponse.length; i++){
				console.log(catResponse[i]);
				html += `<option value=${catResponse[i].id}>${catResponse[i].name}</option>`
			}

			//isi modal body
			$(".modal-body").html(
				`
		<table class="table table-borderless">
			<tr>
				<td>Category </td>
				<td>
					<select id="input-category">
					${html}
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
				var categoryName = $("#input-category").val();
				console.log(categoryName);
				
				var initial = $("#input-initial").val();
				console.log(initial);

				var name = $("#input-name").val();
				console.log(name);

				var active = $("#input-active").prop("checked");
				console.log(active);

				var modifyBy = "Arnanda";
				console.log(modifyBy);

				//proses ubah json
				var variantDTO = JSON.stringify({
					"id": id,
					"category_id": categoryName,
					"initial": initial,
					"name": name,
					"active": active,
					"modify_by": modifyBy,
				});

				//Panggil API Insert
				var response = editVariantApi(variantDTO).responseJSON;
				if (response.code == 200) {
					alert(response.message);
					$(".modal").modal("hide");
					refreshList();
				} else {
					alert(response.message);
				}
			})

			//. class
			//# id
			$(".modal").modal("show");
		}