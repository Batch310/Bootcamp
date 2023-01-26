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
	private UserRepository ur;

	@Autowired
	private TokenRepository tr;
	
	@Autowired
	private EmailService es;
	
	@Autowired
	private RoleRepository rr;
	
	@Autowired
	private BiodataRepository br;

	// Ganti Waktu Expired
	private final long expiredToken = 1000 * 60 * 5; // five minutes

	public void sendRegisterEmailOtp(String email) throws Exception {

		// 1. validasi email sudah terpakai belum
		Boolean isEmailExists = ur.checkEmailExists(email);
		if (isEmailExists) {
			throw new Exception("11-Email Terpakai");
		}

		// 2. validasi otp apakah sudah maksimal
		Boolean isMaxOtp = tr.isMaxOtp(email);
		if (isMaxOtp) {
			throw new Exception("12-Maksimal OTP sudah tercapai untuk hari ini");
		}

		// 3. Set Token Exp
		// ambil waktu skrg
		Long waktuMilisNow = System.currentTimeMillis();
		// Nambah waktu
		Long waktuMilisExp = waktuMilisNow + expiredToken;
		Date dateExp = new Date(waktuMilisExp);

		// Generate Token
		String generatedToken = getAlphaNumericString(6);
		
		//4. Insert OTP to Table
		tr.insertToken(generatedToken, email, "Register", dateExp);
		
		//5. Kirim OTP ke email
		String subject = "Request OTP Register POS 310";
		String recipient = email;
		String msgBody = "OTP Anda adalah : " + generatedToken;
		es.sendEmail(subject, recipient, msgBody);
		
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

		public void cekOtp(String email, String otp) throws Exception {
			//Cek Validasi apakah OTP sesuai
			Boolean isOtpCorrect = tr.isOtpCorrect(email, otp);
			if(isOtpCorrect == false) {
				throw new Exception("13-OTP tidak sesuai");
			}
			
			//Cek Validasi apakah OTP exp
			Boolean isOtpExp = tr.isOtpExp(email, otp);
			if(isOtpExp) {
				throw new Exception("14-OTP expired");
			}
			
		}

		public List<RoleDTO> getAllRole() {
			
			return rr.getAllRole();
		}
		
		public void uBio(String email, String password, Long role, String name) {
			Long biodata_id = br.saveBioRegist(name);
			
			ur.saveUserRegist(email, password, role, biodata_id);

		}
		
}
