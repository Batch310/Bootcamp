//----- LOGIN -----
function loginApi(email, password) {
	var formData = new FormData();
	formData.append("email", email);
	formData.append("password", password);

	return $.ajax({
		url: "/api/user/login",
		method: "POST",
		data: formData,
		contentType: false,
		processData: false,
		mimeType: "multipart/form-data",
		async: false
	});
}

function saveLoginData(userDto) {
	return $.ajax({
		url: "/login/saveLoginData",
		method: "GET",
		data: userDto,
		async: false
	});
}

function login() {
	var email = $("#email").val();
	var password = $("#pwd").val();

	var responseText = loginApi(email, password).responseText;
	var response = $.parseJSON(responseText);
	console.log(response);

	if (response.code == 200) {
		console.log("Login Sukses");
		alert(response.message);
		//Menyimpan data login ke session
		var redirectUrl = saveLoginData(response.data).responseText;
		$(location).attr('href', redirectUrl);
	} else {
		alert(response.message);
	}


}