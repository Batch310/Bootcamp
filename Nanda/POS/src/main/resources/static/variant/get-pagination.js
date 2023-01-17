//-------------------------GET ALL CATEGORY
//Fungsi Ajax -> untuk koneksi ke API
function getAllVariantApi() {
	return $.ajax({
		url: "/api/variant/get",
		method: "GET",
		async: false
	});
}

function searchVariantApi(keyword) {
	return $.ajax({
		url: "/api/variant/search?keyword=" + keyword,
		method: "GET",
		async: false
	});
}

function getAllVariantPaginationApi(keyword, limit, page) {
	return $.ajax({
		url: "/api/variant/pagination?keyword=" + keyword + "&limit=" + limit + "&page=" + page,
		method: "GET",
		async: false
	})
}

function refreshList(keyword, page) {
	
	var limit = 3;

	if (keyword == null) {
		keyword =  $("#example-search-input").val();
	}
	
	if(page == null){
		page = 1;
	}
	
	
	var response = getAllVariantPaginationApi(keyword, limit, page).responseJSON;
	console.log(response);

	var list = response.data.data;

	$("#content-tbody").html("");
	for (i = 0; i < list.length; i++) {
		$("#content-tbody").append(
			`
		<tr>
		<td>${list[i].category_name}</td>
		<td>${list[i].initial}</td>
		<td>${list[i].name}</td>
		<td><input type="checkbox" disabled ${list[i].active == true ? 'checked' : ''}></td>
		<td>
			<button class="btn btn-warning" 
			onclick="bukaPopupEdit(
				'${list[i].initial}', 
				'${list[i].name}',
				${list[i].active}, 
				${list[i].id},
				'${list[i].category_name}',
				${list[i].category_id})">
				<i class="fa-solid fa-pen-to-square" color="white"></i>
			</button>
			<button class="btn btn-danger" 
			onclick="bukaPopupDelete(
				'${list[i].initial}',
				'${list[i].name}',
				${list[i].active},
				${list[i].id},
				'${list[i].category_name}',
				${list[i].category_id})">
				<i class="fa-solid fa-trash" color="white"></i></button>
		</td>
		</tr>
		`
		)
	}
	//kosong
	$("#pagination").html("");

	var totalPage = Math.ceil(response.data.total_data / limit);
	
	$("#pagination").append(`
				<li class="page-item ${page == 1 ? 'disabled' : ''}"><a class="page-link" href="#"
				onclick="refreshList(null, ${page-1})"
				>Previous</a></li>
	`)
	
	for (i = 1; i <= totalPage; i++) {
		$("#pagination").append(`
				<li class="page-item ${i == page ? 'active' : ''}"><a class="page-link" href="#"
				onclick="refreshList(null, ${i})"
				>${i}</a></li>
	`)

	}
	
	$("#pagination").append(`
				<li class="page-item ${page == totalPage ? 'disabled' : ''}"><a class="page-link" href="#"
				onclick="refreshList(null, ${page+1})"
				>Next</a></li>
	`)
}

refreshList();