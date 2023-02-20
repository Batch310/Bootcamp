//------------- GET All Mobil -------------------------
function getMobilAPI() {
	//	console.log(code);
	return $.ajax({
		"url": "/api/mobil/get",
		"method": "GET",
		"async": false
	});
}

function getMobil() {

	var response = getMobilAPI().responseJSON;
	console.log(response);

	var list = response.data;

	$("#katalognya").html("");
	for (i = 0; i < list.length; i++) {
		$("#katalognya").append(
			`
			<div class="card" style="width: 20vw; margin: 10px;">
				<a href="#"><img class="card-img-top"
						src="${list[i].url_foto_kecil}"
						alt="Card image cap"></a>
				<div class="card-body">
					<a href="#" onclick="bukaPopupDetail(
											${list[i].brand_id},
											${list[i].id})">
						<h6 class="card-title" style="color: black;">${list[i].nama_brand} ${list[i].nama} ${list[i].tahun}</h6>
					</a>
					<a>
						<p class="card-text">${list[i].harga}</p>
					</a>
				</div>
			</div>
			`
		)
	}
}

getMobil();
//----------------------------------------------------------
//------------- GET Detail Mobil -------------------------
function getMobilDetailAPI(brand_id, type_id) {
	//	console.log(code);
	return $.ajax({
		"url": "/api/mobil/get/detail?brand_id=" + brand_id + "&type_id=" + type_id,
		"method": "GET",
		"async": false
	});
}

function bukaPopupDetail(brand_id, type_id) {

	var response = getMobilDetailAPI(brand_id, type_id).responseJSON;
	console.log(response);

	var list = response.data;
	console.log(list);
	console.log(list.url_foto_besar);
	//Ganti Title
	$(".modal-title").html("Detail Mobil");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<div class="card" style="width: 18rem;">
			<a href="#"><img class="card-img-top"
					src="${list.url_foto_besar}"
					alt="Card image cap"></a>
			<div class="card-body">
					<h6 class="card-title" style="color: black;">${list.nama_brand} ${list.nama} ${list.tahun}</h6>
				<a>
					<p class="card-text">${list.harga}</p>
					<p class="card-text">Kapasitas Kursi : ${list.kapasitas_kursi}</p>
					<p class="card-text">Bahan Bakar : ${list.bahan_bakar}</p>
					<p class="card-text">Transmisi : ${list.transmisi}</p>
				</a>
			</div>
		</div>
		`
	);

	//. class
	//# id
	$(".modal").modal("show");
}
//-------------------------------------------------------------