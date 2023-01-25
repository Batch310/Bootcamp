package id.bootcamp.java310.pos.services;

import java.util.Date;
import java.util.List;
import java.util.Random;

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
	private UserRepository usrep;

	@Autowired
	private TokenRepository tokrep;
	
	@Autowired
	private EmailService emser;
	
	@Autowired
	private RoleRepository rolrep;
	
	@Autowired
	private BiodataRepository biorep;

	// Millis untuk waktu expired otp
	private final long expiredToken = 1000 * 60 * 5;

	public void sendOtpToEmail(String email) throws Exception {
		// 1. Validasi email apakah email sudah dipakai
		Boolean isEmailExsists = usrep.isEmailExists(email);
		if (isEmailExsists) {
			throw new Exception("11-Email sudah terpakai!");
		}

		// 2. Validasi apakah otp sudah maksimal kirimnya per email
		Boolean isMaxOtp = tokrep.isMaxOTP(email);
		if (isMaxOtp) {
			throw new Exception("12-Pengiriman OTP sudah mencapai batas maksimal!");
		}

		// 3. Set expired OTP
		Long waktuMillisSekarang = System.currentTimeMillis();
		Long waktuMillisExpired = waktuMillisSekarang + expiredToken;
		Date dateExpired = new Date(waktuMillisExpired);

		// 3. Generate Token
//		Random randomGen = new Random();
		String generateToken = getAlphaNumericString(10);
		
		// 4. Insert OTP ke table
		tokrep.insertToken(generateToken, email, "Register", dateExpired);
		
		// 5. Kirim OTP ke email
		String subject = "Request OTP Register POS 310";
		String recipient = email;
		String msgBody = "OTP Anda adalah " + generateToken;
		emser.sendEmail(subject, recipient, msgBody);

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

	public void checkOtpGais(String email, String otp) throws Exception {
		// TODO Auto-generated method stub
		// Validasi apakah otp sesuai
		Boolean isOtpCorrect = tokrep.isOtpCorrect(email, otp);
		if (isOtpCorrect == false) {
			throw new Exception ("13-OTP Tidak Sesuai");
		}
		
		// Validasi apakah otp expired
		Boolean isOtpExpired = tokrep.isOtpExpired(email, otp);
		if (isOtpExpired) {
			throw new Exception ("14-OTP expired");
		}
	}

	public List<RoleDTO> cariRoleCoy() {
		// TODO Auto-generated method stub
		return rolrep.getAllRole();
	}

	public void insertUserCoy(String email, String password, String name, Long role_id) {
		// TODO Auto-generated method stub
		Long biodata_id = biorep.saveBiodataRegister(name);
		usrep.saveUserRegister(email, password, role_id, biodata_id);
		
		
	}


}
