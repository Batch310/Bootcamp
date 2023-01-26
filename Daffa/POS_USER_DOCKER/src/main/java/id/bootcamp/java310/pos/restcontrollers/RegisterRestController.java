package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import javax.management.relation.Role;

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
	private RegisterService regser;

	@PostMapping("/sendRegisterOtp")
	public Resp<String> sendEmail(@RequestParam("email") String email) {

		try {
			int code = 200;
			String message = "OTP berhasil dikirim ke email";

			// Proses mengirim otp ke email
			regser.sendOtpToEmail(email);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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

	@PostMapping("/checkRegisterOtp")
	public Resp<String> checkOtp(@RequestParam("email") String email, @RequestParam("otp") String otp) {

		try {
			int code = 200;
			String message = "OTP sesuai";

			// Proses mengirim otp ke email
			regser.checkOtpGais(email, otp);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
			String message = "Sukses mendapatkan data role";

			// Proses mengirim otp ke email
			List<RoleDTO> roleList = regser.cariRoleCoy();

			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleList);

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
	public Resp<String> insertUser(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("name") String name, @RequestParam("role_id") Long role_id) {

		try {
			int code = 200;
			String message = "Sukses menambahkan user";

			// Proses mengirim otp ke email
			regser.insertUserCoy(email, password, name, role_id);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
