//----- GET ALL CATEGORY-----
		//Fungsi ajax -> untuk koneksi ke API
		function getAllCategoriesAPI() {
			return $.ajax({
				url: "/api/category/get",
				method: "GET",
				async: false
			});
		}

		function refreshList() {
			var response = getAllCategoriesAPI().responseJSON;
			console.log(response);

			var list = response.data;

			$("#content-tbody").html("");
			for (i = 0; i < list.length; i++) {
				$("#content-tbody").append(
					`
				<tr>
					<td>${list[i].initial}</td>
					<td>${list[i].name}</td>
					<td><input type="checkbox" disabled ${list[i].active == true ? 'checked' : ''}></td>
					<td>
						<button class="btn btn-warning" 
						onclick="bukaPopupEdit(
							'${list[i].initial}',
							'${list[i].name}',
							${list[i].active},
							${list[i].id})">
							<i class="fa-regular fa-pen-to-square" color="white"></i>
						</button>
						<button class="btn btn-danger" onclick="bukaPopupDelete(
							'${list[i].initial}',
							'${list[i].name}',
							${list[i].active},
							${list[i].id})">
							<i class="fa-solid fa-trash" color="white"></i>
						</button>
					</td>
				</tr>
				`
				)
			}
		}
		refreshList();