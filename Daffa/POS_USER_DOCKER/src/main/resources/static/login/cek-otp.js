//----- CEK OTP -----
function checkOTP(email, otp) {
	var form = new FormData();
	form.append("email", email);
	form.append("otp", otp);

	return $.ajax({
		"url": "/checkRegisterOtp",
		"method": "POST",
		"processData": false,
		"mimeType": "multipart/form-data",
		"contentType": false,
		"data": form,
		async: false
	});
}
function popupOTP(email, otp) {
	console.log("OTP Kepencet!")

	//Ganti Title
	$(".modal-title").html("SendOTP");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
			<tr>
				<td>OTP</td>
				<td>
					<input id="input-otp" class="form-control">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-send-otp" class="btn btn-primary">Send OTP</button>
				</td>
			</tr>
		</table>
		`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-send-otp").click(function() {
		$("#input-send-otp").prop("disabled", true);
		var otp = $("#input-otp").val();
		var responseText = checkOTP(email, otp).responseText;
		var responseJson = $.parseJSON(responseText);
		console.log(responseJson);
		if (responseJson.code == 200) {
			alert(responseJson.message);
			popupBiodata(email, otp);
		} else {
			alert(responseJson.message);
			$("#input-register").prop("disabled", false);
		}

	});

	//. class
	//# id
	$(".modal").modal("show");
}