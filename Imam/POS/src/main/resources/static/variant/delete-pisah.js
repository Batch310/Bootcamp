//---------------------DELETE---------------------------------

		function deleteVariantApi(variantId) {
			var formData = new FormData();
			formData.append("id", variantId);

			return $.ajax({
				url: "/api/variant/delete",
				method: "DELETE",
				data: formData,
				contentType: false,
				processData: false,
				mimeType: "multipart/form-data",
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
		
		
	//ini yang nerima dari read(response)
		function bukaPopupHapus(initial, name, active, id, category_name,category_id) {
			console.log(category_id+" "+category_name+" "+initial + " " + name + " " + active + " " + id)
			
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
			$(".modal-title").html("Hapus")

			//Ngisi Modal body
			$(".modal-body").html(
				`
			<h5> Are you sure you want to delete this?</h5>
			<table class="table table-borderless">
				
				<tr>
					<td>Category</td>
					<td >${category_name}</td>
				</tr>
				<tr>
					<td>Initial</td>
					<td>${initial}</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>${name}</td>	
				</tr>
				<tr>
					<td>Active</td>
					<td><input type="checkbox" ${active == true ? 'checked' : ''} disabled></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button id="input-cancel" class="btn btn-light">Cancel</button>
						<button id="input-delete" class="btn btn-danger">Delete</button>
					</td>
				</tr>
			</table>
			`
			);

			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			});

			$("#input-delete").click(function () {
				
				//Ambil response Text
				var response = deleteVariantApi(id).responseText;
				//Convert ke JSON
				var responseJson = $.parseJSON(response);
				console.log(response);
				
					if (responseJson.code == 200) {
					alert(responseJson.message);
					$(".modal").modal("hide"); //ditutup
					refreshList();
				} else {
					alert(responseJson.message);
				}

			});



			// . => class
			// # => id

			$(".modal").modal("show");
		}