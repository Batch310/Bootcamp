//-------------------EDIT CATEGORY-------------------------------------------

		function editCategoriesApi(categoryDTO) {
			return $.ajax({
				url: "/api/category/update",
				method: "PUT",
				data: categoryDTO,
				contentType: "application/json",
				async: false
			});
		}

		function bukaPopupEdit(initial, name, active, id) {
			console.log("Edit Category Clicked")
			console.log(initial + " " + name + " " + active + " " + id)
			//Ganti title
			$(".modal-title").html("Edit");

			//isi modal body
			$(".modal-body").html(
				`
		<table class="table table-borderless">
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
				var initial = $("#input-initial").val();
				console.log(initial);

				var name = $("#input-name").val();
				console.log(name);

				var active = $("#input-active").prop("checked");
				console.log(active);

				var modifyBy = "Arnanda";
				console.log(modifyBy);

				//proses ubah json
				var categoryDTO = JSON.stringify({
					"initial": initial,
					"name": name,
					"active": active,
					"modify_by": modifyBy,
					"id": id
				});

				//Panggil API Edit
				var response = editCategoriesApi(categoryDTO).responseJSON;
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

		//-------------------------------------------------------------------------------------------------------