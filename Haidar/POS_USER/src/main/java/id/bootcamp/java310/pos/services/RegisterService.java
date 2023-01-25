package id.bootcamp.java310.pos.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;
import id.bootcamp.java310.pos.repositories.RoleRepository;
import id.bootcamp.java310.pos.repositories.TokenRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class RegisterService {

	@Autowired
	private UserRepository ur;

	@Autowired
	private TokenRepository tr;
	
	@Autowired
	private EmailService es;
	
	@Autowired
	private RoleRepository rr;
	
	@Autowired
	private BiodataRepository br;

	// Millis, gonta ganti waktu expired disini
	private final long expiredToken = 1000 * 60 * 5; // 5 menit

	public void sendOTPToRegisteredEmail(String email) throws Exception {

		// 1. Validasi apakah email sudah terpakai
		Boolean isEmailExists = ur.isEmailExists(email);
		if (isEmailExists) {
			throw new Exception("11-Email already used!");
		}

		// 2. Validasi apakah otp sudah mencapai batas maksimal per email
		Boolean isMaxOTP = tr.isMaxOTP(email);
		if (isMaxOTP) {
			throw new Exception("12-OTP has reached the maximum limit!");
		}

		// Set Expired Date OTP
		Long millisNow = System.currentTimeMillis(); // Ambil waktu sekarang
		Long millisExpired = millisNow + expiredToken; // Waktu sekarang + lama expired token
		Date dateExpired = new Date(millisExpired);

		// Generate Token
		String generatedToken = getAlphaNumericString(10);
		
		// 3. Insert OTP ke Tabel
		tr.insertToken(generatedToken, email, "Register", dateExpired);
		
		// 4. Kirim OTP ke email
		String recipient = email;
		String subject = "Request OTP Register POS 310";
		String msgBody = "OTP anda adalah: " + generatedToken;
		es.sendEmail(recipient, subject, msgBody);		
				
	}

	String getAlphaNumericString(int n) {

		// choose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789" 
				+ "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public void checkOTPToRegisteredEmail(String email, String otp) throws Exception {

		// 5. Validasi apakah otp benar
		Boolean isOTPCorrect = tr.isOTPCorrect(email, otp);
		if (!isOTPCorrect) {
			throw new Exception("13-OTP is incorrect");
		}
		
		// 6. Validasi apakah otp expire
		Boolean isOTPExpired = tr.isOTPExpired(email, otp);
		if (isOTPExpired) {
			throw new Exception("14-OTP has expired");
		}
		
		
	}

	public List<RoleDTO> getAllRoles() {
		return rr.getAllRoles();
	}

	public void saveRegister(String email, String password, String name, Long role_id) {
		
		Long biodataId = br.saveBiodataRegister(name);
		
		ur.saveUserRegister(email, password, role_id, biodataId);
		
	}

}
