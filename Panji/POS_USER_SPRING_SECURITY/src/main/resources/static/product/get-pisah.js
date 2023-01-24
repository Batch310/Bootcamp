//------------- GET ALL CATEGORIES -------------------------
function getAllProductsApi() {
	return $.ajax({
		url: "/api/product/get",
		method: "GET",
		async: false
	});
}

function refreshList() {
	var response = getAllProductsApi().responseJSON;
	console.log(response);

	var list = response.data;

	$("#content-tbody").html("");
	for (i = 0; i < list.length; i++) {
		$("#content-tbody").append(
			`
			<tr>
			<td>${list[i].category_name}/<br>${list[i].variant_name}</td>
			<td>${list[i].initial}</td>
			<td>${list[i].name}</td> 
			<td>${list[i].description}</td>
			<td>${list[i].price}</td>
			<td>${list[i].stock}</td> 
			<td><input type="checkbox" disabled 
				${list[i].active == true ? 'checked' : ''}></td>
			<td>
				<button class="btn btn-warning" 
				onclick="bukaPopupEdit(
						'${list[i].initial}',
						'${list[i].name}',
						${list[i].active},
						${list[i].id},
						'${list[i].category_name}',
						${list[i].category_id},
						'${list[i].variant_name}',
						${list[i].variant_id},
						'${list[i].description}',
						${list[i].price},
						${list[i].stock})">
					<i class="fa-solid fa-pen-to-square" color="white"></i>
				</button>
				<button class="btn btn-danger" 
				onclick="bukaPopupDelete(
						'${list[i].initial}',
						'${list[i].name}',
						${list[i].active},
						${list[i].id},
						'${list[i].category_name}',
						'${list[i].variant_name}',
						'${list[i].description}',
						${list[i].price},
						${list[i].stock})">
					<i class="fa-solid fa-trash" color="white"></i>
				</button>
			</td>
			</tr>
			`
		)
	}
}

refreshList();
//----------------------------------------------------------