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
import id.bootcamp.java310.pos.restcontrollers.RegisterRestController;

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

	// Ganti waktu expired token
	private final long expiredToken = 1000 * 60 * 5;

	public void kirimEmailRegisterOtp(String email) throws Exception {
		// TODO Auto-generated method stub

		// 1. Validasi apakah email sudah terpakai atau belum
		Boolean isEmailExists = ur.checkEmailExists(email);
		if (isEmailExists) {
			throw new Exception("11-Email sudah terpakai");
		}
		// 2. Validasi apakah OTP sudah max terpakai
		Boolean isMaxOtp = tr.isMaxOtp(email);
		if (isMaxOtp) {
			throw new Exception("12-Jumlah MAX OTP harian terpakai");
		}
		// 3. Set expired token
		// Ambil waktu sekarang
		Long waktuMilisSekarang = System.currentTimeMillis();

		// Tambah waktu
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		Date dateExpired = new Date(waktuMilisExpired);

		// Genereated Token
		String generatedToken = getAlphaNumericString(6);

		// 4. Insert OTP ke table
		tr.insertToken(generatedToken, email, "RegisterBaru", dateExpired);

		// 5. Kirim OTP ke email
		String subject = "Request OTP Register Batch 310";
		String recipient = email;
		String messageBody = "OTP anda adalah : " + generatedToken;
		es.sendEmail(subject, recipient, messageBody);
	}

	// function to generate a random string of length n
	String getAlphaNumericString(int n) {

		// choose a Character random from this String
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
		// + "abcdefghijklmnopqrstuvxyz"
		// kirim OTP angka
		String AlphaNumericString = "0123456789";

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

	public void cekRegisterOtp(String email, String otp) throws Exception {
		// 1. Apakah OTP sesuai
		Boolean isOtpCorrect = tr.isOtpCorrect(email, otp);
		if (isOtpCorrect == false) {
			throw new Exception("13-OTP tidak sesuai");
		}

		// 2. Expired token
		Boolean isOtpExpired = tr.isOtpExpired(email, otp);
		if (isOtpExpired) {
			throw new Exception("14-Token expired");
		}
	}

	public List<RoleDTO> getAllRole() {
		// TODO Auto-generated method stub
		return rr.getAllRole();
	}
	
	public void insertRegister(String email,  String password, Long role_id, String name) {
		Long insertRegister = br.saveBiodataRegister(name);
		ur.savUserRegister(email, password, role_id, insertRegister);
	}
}
