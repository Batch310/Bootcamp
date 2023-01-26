package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.services.BiodataService;
import id.bootcamp.java310.pos.services.MenuService;
import id.bootcamp.java310.pos.services.RegisterService;
import id.bootcamp.java310.pos.services.UserService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
public class RegisterRestControllers {
	@Autowired
	private RegisterService rs;
	@Autowired
	private UserService us;
	
	@PostMapping("/sendRegisterOtp")
	public Resp<String> sendEmail(@RequestParam("email") String mail){
		try {
			int code = 200;
			String message = "email sukses dikirim";
			
			rs.sendRegisterEmailOtp(mail);
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}catch(Exception e) {
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
	
	@PostMapping("/cekRegisterOtp")
	public Resp<String> cekOtp(@RequestParam("email") String mail,@RequestParam("otp") String otp){
		try {
			int code = 200;
			String message = "OTP sudah sesuai";
			
			rs.cekRegisterOtp(mail,otp);
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}catch(Exception e) {
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
	@GetMapping("/getRoles")
	public Resp<List<RoleDTO>> getRoles(){
		try {
			int code = 200;
			String message = "OTP sudah sesuai";
			
			//proses service
			List<RoleDTO> roleList = rs.getAllRole();
			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleList);
			return response;
		}catch(Exception e) {
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
	
	@PostMapping("/insertRegistrasi")
	public Resp<String> insertRegistrasi(@RequestParam("email") String mail,
			@RequestParam("password") String password,
			@RequestParam("name") String name,
			@RequestParam("role_id") Long role_id) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Registrasi telah berhasil";
			rs.insertRegistrasi(mail,password,name,role_id);

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
