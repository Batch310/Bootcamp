package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Resp<String> kirimOtpEmail(@RequestParam("email") String email) {
		try {
			int code = 200;
			String message = "Email sukses terkirim";

			rs.kirimEmailRegisterOtp(email);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
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

	@PostMapping("/cekRegisterOtp")
	public Resp<String> cekOtp(@RequestParam("email") String email, @RequestParam("otp") String otp) {
		try {
			int code = 200;
			String message = "OTP sesuai";

			rs.cekRegisterOtp(email, otp);

			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
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

	@GetMapping("/getRole")
	public Resp<List<RoleDTO>> getRole() {
		try {
			int code = 200;
			String message = "Data Role didapatkan";

			List<RoleDTO> roleList = rs.getAllRole();

			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleList);

			return response;
		} catch (Exception e) {
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

	@PostMapping("/baru")
	public Resp<Long> saveBaru(
			@RequestParam("email") String email, 
			@RequestParam("password") String password,
			@RequestParam("role_id") Long roleId, 
			@RequestParam("name") String name) {
		try {
			int code = 200;
			String message = "Data berhasil ditambahkan";

			rs.insertRegister(email, password, roleId, name);
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			// TODO: handle exception
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
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
