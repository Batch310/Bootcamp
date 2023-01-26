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
	RegisterService rs;
	
	@PostMapping("/sendRegisterOtp")
	public Resp<String> sendEmailOTP(
			@RequestParam ("email") String mail){
		
		try {
			int code = 200;
			String message = "Kirim Sukses";
			
			//proses ke Service
			
			rs.sendRegisterEmailOTP(mail);
			
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
		public Resp<String> cekOTP(
				@RequestParam ("email") String mail,
				@RequestParam ("otp") String otp){
			
			try {
				int code = 200;
				String message = "kode OTP sesuai";
				
				//proses ke Service
				
				rs.cekRegisterEmailOTP(mail,otp);
				
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
		public Resp<List<RoleDTO>> getAllRole(){
			
			try {
				int code = 200;
				String message = "berhasil dapatkan data role";
				
				//proses ke Service
				
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
		
		@PostMapping("/insertRegister")
		public Resp<String> saveRegister(
				@RequestParam ("email") String mail,
				@RequestParam ("password") String password,
				@RequestParam ("fullname") String fullname,
				@RequestParam ("role_id") Long roleId){
			
			try {
				int code = 200;
				String message = "Sukses";
				
				//proses ke Service
				
				rs.insertRegister(mail,password,fullname,roleId);
				
				
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
