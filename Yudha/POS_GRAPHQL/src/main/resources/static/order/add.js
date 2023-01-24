function searchProductsApi(keyword) {
	return $.ajax({
		url: "/api/product/search?keyword=" + keyword,
		method: "GET",
		async: false
	});
}

function searchProducts(keyword){
	
	if(keyword == null){
		keyword = "";
	}
	
	var response = searchProductsApi(keyword).responseJSON;
	var list = response.data;

	$("#tbody-modal").html("");
	for (i = 0; i < list.length; i++) {
		$("#tbody-modal").append(
			`
			<tr>
				<td>
					<button class ="btn btn-warning" onclick="addProduct('${list[i].name}',${list[i].price},${list[i].id})"> 			
						<i class="fa fa-star" color="white"></i>
					</button>
							</td>
				<td>${list[i].initial}</td>
				<td>${list[i].name}\n${list[i].description}</td>
				<td>${list[i].price}</td>
				<td>${list[i].stock}</td>
			</tr>
			`
		)
	}
}

function bukaPopupOrder() {
	//Ganti Title
	$(".modal-title").html("Select New Order");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
				<!-- Searchbar & Add Button -->
				<div class="row p-3">
					<div class="input-group col-sm-9">
						<input class="form-control border-end-0 border rounded-pill"
							type="text" placeholder="search by name" id="example-search-input">
						<span class="input-group-append">
							<button
								class="btn btn-outline-secondary bg-white border-start-0 border rounded-pill ms-n3"
								type="button" id="btn-search">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
					<div class="col-sm-3 text-right">
						
					</div>
				</div>
				<table class="table">
					<thead>
						<tr>
							<td>
								Select
							</td>
							<td>
								Initial
							</td>
							<td>
								Name/Description
							</td>
							<td>
								Price
							</td>
							<td>
								Stock
							</td>
						</tr>
					</thead>
					<tbody id="tbody-modal">
					</tbody>
				</table>
				`
	);
	
	searchProducts();

	$("#btn-search").click(function(){
		var keyword = $("#example-search-input").val();
	
		searchProducts(keyword);
	});

	$(".modal").modal("show");
}

function addProduct(name, price, id) {
	$("#tableData tr:last").remove();
	$(".content-body").append(`
				<tr class='content-row'>
					<td>
						<input class="content-id" type="hidden" value="${id}">
						<input value="${name}" disabled>
					</td>
					<td><input class="content-price" value="${price}" disabled></td>
					<td><input class="content-quantity" value="1"
						onchange="recalculate()"></td>
					<td><input class="content-amount" value="4000" disabled></td>
					<td>
						<button class="btn btn-danger content-delete">
							<i class="fa-solid fa-trash" color="white"></i>
						</button>
					</td>
				</tr>
				<tr>
					<td>Total</td>
					<td></td>
					<td><input id="total-quantity" value="3" disabled></td>
					<td><input id="total-price" value="26000" disabled></td>
					<td>Remove</td>
				</tr>
			`)

	recalculate();
	$(".modal").modal("hide");
}