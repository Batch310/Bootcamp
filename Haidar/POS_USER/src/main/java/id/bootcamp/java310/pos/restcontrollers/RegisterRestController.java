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

	@PostMapping("/sendRegisterOTP")
	public Resp<String> sendEmailOTP(@RequestParam("email") String email) {

		try {
			int code = 200;
			String message = "Successfully Send OTP to Email";

			// Proses ke Service
			rs.sendOTPToRegisteredEmail(email);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}
	}

	@PostMapping("/checkRegisterOTP")
	public Resp<String> checkOTP(@RequestParam("email") String email, @RequestParam("otp") String otp) {

		try {
			int code = 200;
			String message = "Oh Yeah, OTP matches";

			// Proses ke Service
			rs.checkOTPToRegisteredEmail(email, otp);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}
	}

	@GetMapping("/getAllRoles")
	public Resp<List<RoleDTO>> getAllRoles() {
		try {
			int code = 200;
			String message = "Successfully Get All Roles";

			// Proses ke Service
			List<RoleDTO> roleListData = rs.getAllRoles();

			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleListData);
			
			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}
	}

	@PostMapping("/saveRegister")
	public Resp<Long> saveRegister(@RequestParam("email") String email, 
			@RequestParam("password") String password,
			@RequestParam("name") String name,
			@RequestParam("role_id") Long role_id) {

		try {
			int code = 200;
			String message = "You are registered!";

			// Proses ke Service
			rs.saveRegister(email, password, name, role_id);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}
	}
}
