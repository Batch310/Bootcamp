function getAllCategoriesApi() {
	return $.ajax({
		url: "/api/category/get",
		method: "GET",
		async: false
	});
}

function searchCategoriesApi(keyword){
	console.log(keyword);
	return $.ajax({
		url: "/api/category/search?keyword=" + keyword,
		method: "GET",
		async: false
	});
}