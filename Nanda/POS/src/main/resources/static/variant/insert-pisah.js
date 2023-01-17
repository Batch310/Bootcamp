//------------------INSERT------------------------------------
		function insertVariantApi(variantDTO) {
			return $.ajax({
				url: "/api/variant/insert",
				method: "POST",
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
		
		function bukaPopupAdd() {
			console.log("Add Variant Clicked")			
			//Ganti title
			$(".modal-title").html("Create New");
			
			//ambil isi dropdown
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
				<td><input id="input-initial" class="form-control"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input id="input-name" class="form-control"></td>
			</tr>
			<tr>
				<td>Active</td>
				<td><input id="input-active" type="checkbox"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-create" class="btn btn-success">Create</button>
				</td>
			</tr>
		</table>
		`
			);
			
			$("#input-cancel").click(function(){
				$(".modal").modal("hide");
			})
			
			$("#input-create").click(function(){
				var categoryName = $("#input-category").val();
				console.log(categoryName);
				
				var initial = $("#input-initial").val();
				console.log(initial);

				var name = $("#input-name").val();
				console.log(name);

				var active = $("#input-active").prop("checked");
				console.log(active);

				var createBy = "Arnanda";
				console.log(createBy);

				//proses ubah json
				var variantDTO = JSON.stringify({
					"initial": initial,
					"name": name,
					"active": active,
					"create_by": createBy,
					"category_id": categoryName
				});

				//Panggil API Insert
				var response = insertVariantApi(variantDTO).responseJSON;
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