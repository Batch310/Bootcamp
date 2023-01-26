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
	public Resp<String> sendEmailOtp(@RequestParam("email") String email) {

		try {

			int code = 200;
			String message = "Email Terkirim";

			// Proses ke Service
			rs.sendRegisterEmailOtp(email);

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
	public Resp<String> cekOtp(@RequestParam("email") String email, @RequestParam("otp") String otp) {

		try {

			int code = 200;
			String message = "OTP sesuai";

			// Proses ke Service
			rs.cekOtp(email, otp);

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

			int code = 200;
			String message = "Sukses Get data Role";

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
	
	@PostMapping("/insertFormRegister")
	public Resp<String> insertForm(
			@RequestParam("email") String email, 
			@RequestParam("password") String password, 
			@RequestParam("role_id") Long role, 
			@RequestParam("name") String name) {

		try {

			int code = 200;
			String message = "berhasil";

			// Proses ke Service
			rs.uBio(email, password, role, name);

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
