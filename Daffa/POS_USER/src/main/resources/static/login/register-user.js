function registerUser(email, password, name, role_id) {
	var form = new FormData();
	form.append("email", email);
	form.append("password", password);
	form.append("name", name);
	form.append("role_id", role_id);

	return $.ajax({
		"url": "/insertUser",
		"method": "POST",
		"processData": false,
		"mimeType": "multipart/form-data",
		"contentType": false,
		"data": form,
		async: false
	});
}
function getAllRole() {
	return $.ajax({
		url: "/getRoles",
		method: "GET",
		async: false
	});
}
function popupBiodata(email, otp) {
	console.log("Biodata Kepencet!")

	var roleResponse = getAllRole().responseJSON;
	var dataList = roleResponse.data;
	var html = "";

	for (i = 0; i < dataList.length; i++) {
		html += `<option value=${dataList[i].id}>${dataList[i].name}</option>`;
	}

	//Ganti Title
	$(".modal-title").html("Biodata Register");

	//Ngisi Modal Bodynya
	$(".modal-body").html(
		`
		<table class="table table-borderless">
			<tr>
				<td>Email</td>
				<td>
					<input id="input-email" class="form-control" value="${email}" disabled>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input id="input-password" class="form-control">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input id="input-name" class="form-control">
				</td>
			</tr>
			<tr>
				<td>Role</td>
				<td>
					<select id="input-role" class="form-control">
						<option value="1">ADMIN</option>
						<option value="2">WAREHOUSE</option>
						<option value="3">CASHIER</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button id="input-cancel" class="btn btn-light">Cancel</button>
					<button id="input-biodata-register" class="btn btn-primary">Register</button>
				</td>
			</tr>
		</table>
		`
	);

	$("#input-cancel").click(function() {
		$(".modal").modal("hide");
	});

	$("#input-biodata-register").click(function() {

		var email = $("#input-email").val();
		console.log("email " + email)

		var password = $("#input-password").val();
		console.log("password " + password);

		var name = $("#input-name").val();
		console.log("name " + name);

		var roleCode = $("#input-role").val();
		console.log("role " + roleCode);

		var response = registerUser(email, password, name, roleCode);


		$(".modal").modal("hide");
	});

	//. class
	//# id
	$(".modal").modal("show");
}