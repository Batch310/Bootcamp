function recalculate() {
	console.log("terpanggil");
	//Mengambil semua element price
	var arrPrice = $(".content-price");
	//Mengambil semua element quantity
	var arrQuantity = $(".content-quantity");
	//Mengambil semua element Amount
	var arrAmount = $(".content-amount");

	//Replace berdasarkan quantity
	var totalQuantity = 0;
	var totalAmount = 0;
	for (i = 0; i < arrAmount.length; i++) {
		var price = $(".content-price").eq(i).val();
		var quantity = $(".content-quantity").eq(i).val();
		var amount = price * quantity;

		totalQuantity += +quantity;
		totalAmount += +amount;
		console.log(totalQuantity);
		console.log(totalAmount);

		$(".content-amount").eq(i).val(amount)
	}

	$("#total-quantity").val(totalQuantity);
	$("#total-price").val(totalAmount);
}

$('#tableData').on('click', '.content-delete', function(e) {
	var element = $(".content-delete");
	var index = element.index(this)
	console.log(index);

	$(".content-row").eq(index).remove();
	recalculate();
});