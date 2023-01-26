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
	private BiodataRepository br;

	@Autowired
	private TokenRepository tr;

	@Autowired
	private EmailService es;
	
	@Autowired
	private RoleRepository rp;

	// Ganti" waktu expired disini!, Milis => 1000 = 1 detik
	private final long expiredToken = 1000 * 60 * 5; // 5 Menit

	// Mengirim/membawa data email
	// throws disini melempar ke restController
	public void sendRegisterEmailOtp(String mail) throws Exception {

		// CEK SEMUA VALIDASI

		// 1. Validasi email, apakai email sudah dipakai?
		Boolean isEmailExists = ur.checkEmailExists(mail);
		if (isEmailExists) {
			throw new Exception("11-email sudah terpakai");
		}

		//
		Boolean isMaxOtp = tr.isMaxOtp(mail);
		if (isMaxOtp) {
			throw new Exception("12-OTP sudah mencapai maksimal hari ini");
		}

		// 3. Set expired Date token
		// Ambil waktu sekarang
		Long waktuMilisSekarang = System.currentTimeMillis();
		// Cari waktu expired nya
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		Date dateExpired = new Date(waktuMilisExpired);

		// Generate Token, membuat token atau otp secara random
		// 10 = sejumlah 10 digit otp
		String generatedToken = getAlphaNumericString(4);

		// 4. Insert OTP ke table
		tr.insertToken(generatedToken, mail, "Register", dateExpired);

		// 5.Kirim OTP ke email
		String subjek = "Request OTP Ragister POS 310";
		String recepient = mail;
		String msgBody = "OTP anda adalah " + generatedToken;
		es.sendEmail(subjek, recepient, msgBody);

	}

	// function to generate a random string of length n
	String getAlphaNumericString(int n) {

		// choose a Character random from this String
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
		//  "abcdefghijklmnopqrstuvxyz"
				
		String AlphaNumericString = "0123456789" ;

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

	//CEK INPUTAN OTP
	public void cekRegisterOtp(String mail, String otp) throws Exception {

		// Cek apakah otp sudah sesuai?
		Boolean isOtpCorrect = tr.isOtpCorrect(mail, otp);
		if (isOtpCorrect == false) {
			throw new Exception("13-otp tidak sesuai");
		}

		// Cek apakah otp sudah expired?
		Boolean isOtpExp = tr.isOtpExpired(mail, otp);

		if (isOtpExp) {
			throw new Exception("14-otp sudah expired");
		}

	}

	public List<RoleDTO> getAllRole() {
	
		return rp.getAllRole();
	}

	public void insertFormRegister(String mail, String password, String name, Long roleId ) {
		
		Long biodata_id = br.saveBiodataRegister(name);
		ur.saveUserRegister(mail, password, roleId, biodata_id);
	}
	
	

}
