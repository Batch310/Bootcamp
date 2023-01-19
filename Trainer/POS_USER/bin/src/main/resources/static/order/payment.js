function insertOrderApi(categoryDto) {
	return $.ajax({
		url: "/api/order/insert",
		method: "POST",
		data: categoryDto,
		contentType: "application/json",
		async: false
	});
}

function payMoney(pay) {
	var amount = $("#input-amount").val();
	var kembalian = pay - amount;
	$("#input-change").val(kembalian);
}

function bukaPopupPayment() {
	var amount = $("#total-price").val();

	//Ganti Title
	$(".modal-title").html("Payment");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
				<table class="table table-borderless">
					<tr>
						<td>Reference</td>
						<td>
							<input id="input-reference" class="form-control" disabled>
						</td>
					</tr>
					<tr>
						<td>Amount</td>
						<td>
							<input id="input-amount" class="form-control" value="${amount}" disabled>
						</td>
					</tr>
					<tr>
						<td>Pay Money</td>
						<td>
							<input id="input-pay" onchange="payMoney(this.value)">
						</td>
					</tr>
					<tr>
					<td>Change</td>
					<td>
						<input id="input-change" class="form-control" disabled>
					</td>
					</tr>
					<tr>
					<td></td>
					<td>
						<button id="input-cancel" class="btn btn-light">Cancel</button>
						<button id="input-create" class="btn btn-warning">Pay!</button>
					</td>
				</tr>
				</table>
				`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-create").click(function() {
		var reference = "SLS-1908-0002";
		var amount = $("#input-amount").val();
		var pay = $("#input-pay").val();
		var change = $("#input-change").val();

		//OrderDetail
		//Mengambil semua element price
		var arrQuantity = $(".content-quantity");
		//Mengambil semua element Amount
		var arrAmount = $(".content-amount");
		//Mengambil semua element Id
		var arrId = $(".content-id");


		var orderHeaderDto = JSON.stringify({
			"amount": amount,
			"create_by": 'Yuhan',
			"listOrderDetail": []
		});

		console.log(orderHeaderDto);

		var orderDetailList = JSON.parse(orderHeaderDto)
		for (i = 0; i < arrAmount.length; i++) {
			var quantity = $(".content-quantity").eq(i).val();
			var amount = $(".content-amount").eq(i).val();
			var id = $(".content-id").eq(i).val();

			orderDetailList['listOrderDetail'].push({
				"productId": id,
				"quantity": quantity,
				"price": amount,
				"create_by": 'Yuhan'
			});
		}

		console.log(orderDetailList);

		var finalDto = JSON.stringify(orderDetailList);

		console.log(finalDto);

		//Panggil API Insert
		var response = insertOrderApi(finalDto).responseJSON;
		if (response.code == 200) {
			alert(response.message);
			openTransactionSuccessPopup(
				response.data,
				amount,
				pay,
				change
			)
			resetTransaction();
		} else {
			alert(response.message);
		}



	});

	//. class
	//# id
	$(".modal").modal("show");

}

function openTransactionSuccessPopup(reference, amount, pay, change) {
	//Ganti Title
	$(".modal-title").html("Payment: Terimakasih!");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
				<table class="table table-borderless">
					<tr>
						<td>Reference</td>
						<td>
							<input id="input-reference" class="form-control" value="${reference}" disabled>
						</td>
					</tr>
					<tr>
						<td>Amount</td>
						<td>
							<input id="input-amount" class="form-control" value="${amount}" disabled>
						</td>
					</tr>
					<tr>
						<td>Pay Money</td>
						<td>
							<input id="input-pay" onchange="payMoney(this.value)" value="${pay}">
						</td>
					</tr>
					<tr>
					<td>Change</td>
					<td>
						<input id="input-change" class="form-control" value="${change}" disabled>
					</td>
					</tr>
					<tr>
					<td></td>
					<td>
						<button id="input-cancel" class="btn btn-light">Close</button>
					</td>
				</tr>
				</table>
				`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});
}