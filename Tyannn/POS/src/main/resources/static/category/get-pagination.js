// -------------- GET ALL CAteGORY -----
function getAllCategoriesApi() {
	return $.ajax({
		url: "/api/category/get",
		method: "GET",
		async: false

	});
}

function searchCategoriesApi(keyword) {
	return $.ajax({
		url: "/api/category/search?keyword=" + keyword,
		method: "GET",
		async: false

	});
}
function getAllCategoriesPaginationApi(keyword, limit, page) {
	return $.ajax({
		url: "/api/category/pagination?keyword=" + keyword + "&limit=" + limit + "&page=" + page,
		method: "GET",
		async: false

	})
}




function refreshList(keyword, page) {

	var limit = 5;

	if (keyword == null) {
		keyword = $("#example-search-input").val();
	}

	if (page == null) {
		page = 1;
	}


	var response = getAllCategoriesPaginationApi(keyword, limit, page).responseJSON;
	console.log(response);

	var list = response.data.data;

	$("#content-tbody").html("")
	for (i = 0; i < list.length; i++) {
		$("#content-tbody").append(
			`
		<tr>
			<td>${list[i].initial}</td><!-- Kolom -->
			<td>${list[i].name}</td>
			<td><input type="checkbox" disabled ${list[i].active == true ? 'checked' : ''}></td>
				<td>
					<button class="btn btn-warning" onclick="bukaPopupEdit('${list[i].initial}',
					'${list[i].name}',
					${list[i].active},
					${list[i].id})">
						<i class="fa-solid fa-pen-to-square" color="white"></i>
					</button>
					<button class="btn btn-danger" onclick="bukaPopupDelete('${list[i].initial}',
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
	//kosongin
	$("#pagination").html("");

	//Hitung total page
	// 3 dari 10 -> 4 halaman 
	// 4 dari 10 -> 3 halaman
	var totalPage = Math.ceil(response.data.total_data / limit);
	console.log(totalPage);
	$("#pagination").append(`
		<li class="page-item ${page == 1 ? 'disabled' : ''}"><a class="page-link" href="#"
		onclick="refreshList(null,${page - 1})"
		>previous</a></li>
		`)

	for (i = 1; i <= totalPage; i++) {
		$("#pagination").append(`
		<li class="page-item ${page == i ? 'active' : ''}"><a class="page-link" href="#"
		onclick="refreshList(null,${i})"
		>${i}</a></li>
		`)
	}
	$("#pagination").append(`
		<li class="page-item ${page == totalPage ? 'disabled' : ''}"><a class="page-link" href="#"
		onclick="refreshList(null,${page + 1})"
		>Next</a></li>
		`)

}

refreshList();