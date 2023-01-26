package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.services.RegisterService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController

public class RegisterRestController {

	@Autowired
	private RegisterService rs;

	@PostMapping("/sendRegisterOtp")
	public Resp<String> sendEmailOtp(@RequestParam("email") String mail) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "email sukses dikirim!";

			// Proses ke Service

			rs.sendRegisterEmailOtp(mail);
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}

	@PostMapping("/cekRegisterOtp")
	public Resp<String> cekOtp(@RequestParam("email") String mail, @RequestParam("otp") String otp) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "OTP sudah sesuai";

			// Proses ke Service

			rs.cekRegisterOtp(mail, otp);
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}
	
	@GetMapping("/getRoles")
	public Resp<List<RoleDTO>> getRoles() {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Sukses mendapatkan data role";

			// Proses ke Service

			List<RoleDTO> roleList = rs.getAllRole();
			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleList);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}
	
	@PostMapping("/insertUser")
	public Resp<String> insertUser(@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("fullname")String fullname,
			@RequestParam("role_id")Long roleId) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Sukses mendapatkan data role";

			// Proses ke Service

			rs.saveRegister(email, password, fullname, roleId);
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}
}
