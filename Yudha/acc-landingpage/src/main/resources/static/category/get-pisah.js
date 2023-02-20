//------------- GET ALL CATEGORIES -------------------------
function getAllCatalogApi() {
	return $.ajax({
		url: "/api/type/get/",
		method: "GET",
		async: false
	});
}

function refreshList() {
	var response = getAllCatalogApi().responseJSON;
	console.log(response);

	var list = response.data;

	$("#content-tbody").html("");
	for (i = 0; i < list.length; i++) {
		$("#content-tbody").append(
			`
				<tr>
					<td class="text-center">
						<img data-image="" src="${list[i].url_gambar_besar}"
							alt="ULTRA-BLACK-SOLID.jpg" width="300" height="200">
					</td>
				</tr>
				<tr>
					<td class="text-center">
						<span data-expression="">${list[i].name}</span>
						<div class="text-center">
							<button id="content-detail" class="btn btn-primary" onclick="bukaDetail()">Detail</button>
						</div>
					</td>
				</tr>
			`
		)
	}
}

refreshList();

function bukaDetail() {
	console.log("Add Category Kepencet!")

	//Ganti Title
	$(".modal-title").html("DAIHATSU NEW AYLA");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
			<tr>
				<td>
				<td class="text-center">
						<img data-image="" src="https://netimg.acc.co.id/ACCONE/UNIT/17344/ULTRA-BLACK-SOLID.jpg"
							alt="ULTRA-BLACK-SOLID.jpg" width="300" height="200">
					</td>
				</td>
				
			</tr>
			<tr>
				<td>Harga</td>
				<td>Rp. 1.000.000.000,-</td>
			</tr>
			<tr>
				<td>Tahun</td>
				<td>2022</td>
			</tr>
			<tr>
				<td>Kapasitas Kursi</td>
				<td>5 Kursi</td>
			</tr>
			<tr>
				<td>Bahan Bakar</td>
				<td>Bensin</td>
			</tr>
			<tr>
				<td>Transmisi</td>
				<td>Manual</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-create" class="btn btn-warning">Beli</button>
				</td>
			</tr>
		</table>
		`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-create").click(function() {
		//Ambil Initial
		var initial = $("#input-initial").val();
		console.log(initial);

		//Ambil Name
		var name = $("#input-name").val();
		console.log(name);

		//Ambil Active
		var active = $("#input-active").prop("checked");
		console.log(active);

		//Create By
		var createBy = userId;
		console.log(createBy);

		//Proses Membuat Json JSON
		var categoryDto = JSON.stringify({
			"initial": initial,
			"name": name,
			"active": active,
			"create_by": createBy
		});

		//Panggil API Insert
		var response = insertCategoryApi(categoryDto).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			$(".modal").modal("hide");
			refreshList();
		} else {
			alert(response.message);
		}
	});

	//. class
	//# id
	$(".modal").modal("show");
}

//----------------------------------------------------------