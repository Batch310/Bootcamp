package id.bootcamp.java310.pos.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
