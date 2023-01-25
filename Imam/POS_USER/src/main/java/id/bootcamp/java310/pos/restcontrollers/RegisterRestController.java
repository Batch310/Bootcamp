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

	// Balikan String, karena Di userface tidak meminta balikan
	//KIRIM OTP EMAIL
	@PostMapping("/sendRegisterOtp")
	public Resp<String> sendEmailOtp(@RequestParam("email") String mail){
		
		try {
			// Mengemas Response API
		
			int code = 200;
			String message = "email sukses dikirim";
			
			//Proses ke service
			//paramnya email, Mengirim email
			rs.sendRegisterEmailOtp(mail);
			
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			
			return response;
		} catch (Exception e) {                      //Lemparan error dari Service(Value Query tidak ada)
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
	
	//INPUT & CEK OTP 
	@PostMapping("/cekRegisterOtp")
	public Resp<String> cekOtp(@RequestParam("email") String mail, @RequestParam("otp") String otp){
		
		try {
			// Mengemas Response API
		
			int code = 200;
			String message = "OTP Sudah sesuai";
			
			//Proses ke service
			//paramnya email, Mengirim email
			rs.cekRegisterOtp(mail, otp);
			
			Resp<String> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			
			return response;
		} catch (Exception e) {                      //Lemparan error dari Service(Value Query tidak ada)
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
	
	//INPUT FULL FORM REGISTER 
		@PostMapping("/insertFormRegister")
		public Resp<String> insertFormRegister(
				@RequestParam("email") String mail, 
				@RequestParam("password") String password,
				@RequestParam("name") String name,
				@RequestParam("role_id") Long roleId){
			
			try {
				// Mengemas Response API
			
				int code = 200;
				String message = "Data Register sudah terinput";
				
				//Proses ke service
				//paramnya email, Mengirim email
				rs.insertFormRegister(mail, password,name,roleId);
				
				Resp<String> response = new Resp<>();
				response.setCode(code);
				response.setMessage(message);
				
				return response;
			} catch (Exception e) {                      //Lemparan error dari Service(Value Query tidak ada)
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
	
	
	
	//TAMPILKAN ROLE
	@GetMapping("/getRole")
	public Resp<List<RoleDTO>> getRole(){
		
		try {
			// Mengemas Response API
		
			int code = 200;
			String message = "Sukses ambil data role DTO";
			
			//Proses ke service
			//paramnya email, Mengirim email
			List<RoleDTO> roleList = rs.getAllRole();
			
			Resp<List<RoleDTO>> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(roleList);
			
			return response;
		} catch (Exception e) {                      //Lemparan error dari Service(Value Query tidak ada)
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
	
	
}
