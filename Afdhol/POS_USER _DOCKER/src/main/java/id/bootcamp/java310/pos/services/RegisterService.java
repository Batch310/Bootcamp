package id.bootcamp.java310.pos.services;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
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
	
	// set waktu dalam milis

	private final long expiredToken = 1000 * 60 * 5; // 5 menit

	public void sendRegisterEmailOTP(String mail) throws Exception {

		// 1.Validati email apakah email sudah dipakai

		Boolean isEmailExists = ur.checkEmailIfExist(mail);

		if (isEmailExists) {
			throw new Exception("11-email telah terpakai");
		}

		// 2.Proses validasi apakah sudah maksimal per email

		Boolean isMaxOtp = tr.isMaxOTP(mail);
		if (isMaxOtp) {
			throw new Exception("12-Telah mencapai batas maksimal OTP untuk email ini");
		}

		// 3.Proses set Expired Token
		Long waktuMilisSekarang = System.currentTimeMillis(); // mengambil waktu milis saat dipanggil
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		Date dateExpired = new Date(waktuMilisExpired);

		// generate token
		String generateToken = getAlphaNumericString(10);
		
		//4.memasukkan ke table
		tr.inserToken(generateToken, mail, "Register", dateExpired);
		
		//5.kirim OTP ke email
		String subjek = "Request OTP Register Batch 310";
		String recipient = mail;
		String msgBody = "OTP anda adalah : "+generateToken;
		es.sendEmail(subjek, recipient, msgBody);
		
	}

	String getAlphaNumericString(int n) {

		// choose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

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

	public void cekRegisterEmailOTP(String mail, String otp) throws Exception {
		//melakukan validasi OTP apakah sama
		Boolean isOtpCorrect = tr.isOTPCorrect(mail, otp);
		
		if (isOtpCorrect==false) {
			throw new Exception("13-OTP tidak sesuai");
		}
		
		//cek apakah sudah expired
		Boolean isOtpExp = tr.isOTPExpired(mail, otp);
		
		if (isOtpExp) {
			throw new Exception("14-OTP telah kadaluarsa");

		}
		
	}

	public List<RoleDTO> getAllRole() {
		// TODO Auto-generated method stub
		return rr.getAllRole();
		
	}

	public void insertRegister(String mail, String password, String fullname, Long roleId) {

		Long biodata_id = br.saveBiodataRegister(fullname);
		
		ur.saveUserRegister(mail, password, roleId, biodata_id);
		
	}

}
