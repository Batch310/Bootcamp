//----- REGISTER -----
		function sendEmailAPI(email) {
			var form = new FormData();
			form.append("email", email);

			return $.ajax({
				"url": "/sendRegisterOtp",
				"method": "POST",
				"processData": false,
				"mimeType": "multipart/form-data",
				"contentType": false,
				"data": form,
				async: false
			});
		}
		function popupRegister() {
			console.log("Register Kepencet!")

			//Ganti Title
			$(".modal-title").html("Register");

			//Ngisi Modal Bodynya
			$(".modal-body").html(
				`
		<table class="table table-borderless">
			<tr>
				<td>Email</td>
				<td>
					<input id="input-email" class="form-control">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-register" class="btn btn-primary">Register</button>
				</td>
			</tr>
		</table>
		`
			);

			$("#input-cancel").click(function () {
				$(".modal").modal("hide");
			});

			$("#input-register").click(function () {
				$("#input-register").prop("disabled", true);
				var email = $("#input-email").val();
				var responseText = sendEmailAPI(email).responseText;
				var responseJson = $.parseJSON(responseText);
				if (responseJson.code == 200) {
					alert(responseJson.message);
					popupOTP(email);
				} else {
					alert(responseJson.message);
					$("#input-register").prop("disabled", false);
				}
				
			});

			//. class
			//# id
			$(".modal").modal("show");
		}