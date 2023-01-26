package id.bootcamp.java310.pos.services;

import java.sql.Date;
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

	// Ganti2 waktu expired
	private final long expiredToken = 1000 * 60 * 5;

	public void sendRegisterEmailOtp(String mail) throws Exception {
		// 1. validasi email apakah email sudah dipakai
		Boolean isEmailExists = ur.checkEmailExists(mail);

		if (isEmailExists) {
			throw new Exception("11-email Sudah terpakai");
		}

		// 2. validasi Apakah OTP Sudah maksimal per email
		Boolean isMaxOtp = tr.isMaxOtp(mail);
		if (isMaxOtp) {
			throw new Exception("12-Maksimal OTP Sudah tercapai untuk hari ini");
		}

		// 3. Set expired date token
		// Ambil waktu sekarang
		Long waktuMilisSekarang = System.currentTimeMillis();
		// nambah waktu/milis
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		java.util.Date dateExpired = new java.util.Date(waktuMilisExpired);

		// Genere TOken
		String generatedToken = getAlphaNumericString(10);
		
		//4. Insert OTP ke table
		tr.insertToken(generatedToken, mail,"Register" ,dateExpired);
		
		//5. Kirim OTP ke email
		String subjek = "Request OTP Register POS 310";
		String recipient = mail;
		String msgBody = "OTP anda adalah : "+generatedToken;
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

	public void cekRegisterOtp(String mail, String otp) throws Exception {
		// cek validasi apakah otp sesuai?
		Boolean isOtpCorrect = tr.isOtpCorrect(mail, otp);
		if(isOtpCorrect == false) {
			throw new Exception("23-OTP tidak sesuai");
		}
		
		//cek validasi apakah otp expired
		Boolean isOtpExpired = tr.isOtpExpired(mail, otp);
		if(isOtpExpired) {
			throw new Exception("14-OTP sudah expired");
		}
		
	}

	public List<RoleDTO> getAllRole() {
		// TODO Auto-generated method stub
		return rr.getAllRole();
	}
	
	public void saveRegister(String email,String password, String fullname, Long roleId) {
		Long biodata_id = br.saveBiodataRegister(fullname);
		
		ur.saveRegister(email, password, roleId, biodata_id);
	}

}
