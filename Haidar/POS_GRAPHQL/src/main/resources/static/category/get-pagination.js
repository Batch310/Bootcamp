//============================================= GET ALL CATEGORIES =============================================
//Fungsi Ajax -> Untuk koneksi ke API
function getAllCategoriesAPI() {
	return $.ajax({
		url: "/api/category/get",
		method: "GET",
		async: false
	});
}

function searchCategoryAPI(keyword) {
	console.log(keyword);
	return $.ajax({
		url: "/api/category/search?keyword=" + keyword,
		method: "GET",
		async: false
	});
}

function getAllCategoriesPaginationAPI(keyword, limit, page) {
	console.log(keyword + " " + limit + " " + page);
	return $.ajax({
		url: "/api/category/pagination?keyword=" + keyword + "&limit=" + limit + "&page=" + page,
		method: "GET",
		async: false
	});
}

function refreshList(keyword, page) {
	if (keyword == null) {
		keyword = $("#example-search-input").val();
	}
	
	var limit = 3;
	
	if (page == null) {
		page = 1;
	}
	
	var response = getAllCategoriesPaginationAPI(keyword, limit, page).responseJSON;
	console.log(response);

	var list = response.data.data;

	$("#content-tbody").html("");
	for (i = 0; i < list.length; i++) {
		$("#content-tbody").append(
			`
				<tr>
					<td>${list[i].initial}</td>		
					<td>${list[i].name}</td>		
					<td><input type="checkbox" disabled 
						${list[i].active == true ? 'checked' : ''}></td>		
					<td>
						<button type="button" class="btn btn-warning" 
							onclick="bukaPopupEdit(
								'${list[i].initial}',
								'${list[i].name}',
								${list[i].active},
								${list[i].id})">
							<i class="fa-solid fa-pen-to-square" color="white"></i>
						</button>
						<button type="button" class="btn btn-danger" 
							onclick="bukaPopupDelete(
								'${list[i].initial}',
								'${list[i].name}',
								${list[i].active},
								${list[i].id})">
							<i class="fa-solid fa-trash-can" color="white"></i>
						</button>
					</td>							
				</tr>
			`
		)
	}
	
	//Kosong
	$("#pagination").html("");
	
	//Hitung total page
	//3 data per page dari 10 total data -> 4 halaman => 10/3 dibuletin ke atas
	//4 data per page dari 10 total data -> 3 halaman => 10/3 dibuletin ke atas
	var totalPage = Math.ceil(response.data.total_data / limit);
	console.log(totalPage);
	
	$("#pagination").append(`
			<li class="page-item ${page == 1 ? 'disabled' : ''}"><a class="page-link" href="#"
			onclick="refreshList(null,${page-1})">Previous</a></li>
		`)
	
	for (i = 1; i <= totalPage; i++) {
		$("#pagination").append(`
			<li class="page-item ${page == i ? 'active' : ''}"><a class="page-link" href="#"
			onclick="refreshList(null,${i})">${i}</a></li>
		`)
	}
	
	$("#pagination").append(`
			<li class="page-item ${page == totalPage ? 'disabled' : ''}"><a class="page-link" href="#"
			onclick="refreshList(null,${page+1})">Next</a></li>
		`)
	
}

refreshList();
		//============================================= GET ALL CATEGORIES =============================================