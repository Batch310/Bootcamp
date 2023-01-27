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
	private UserRepository useraseraRepo;

	@Autowired
	private TokenRepository tokenomicRepo;
	
	@Autowired
	private BiodataRepository biodataRepository;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private RoleRepository roleRepository;

	// Ganti2 waktu expired disini saja
	private final long expiredToken = 1000 * 60 * 5; // 5 menit

	public void sendRegisterEmailOtp(String mail) throws Exception {
		
		//1. Validasi Email apakah email sudah dipakai
		Boolean isEmailExists = useraseraRepo.checkEmailExists(mail);
		if(isEmailExists) {
			throw new Exception("11-Email sudah terpakai");
		}
		
		//2. Validasi apakah OTP sudah maksimal per email
		Boolean isMaxOtp = tokenomicRepo.isMaxOtp(mail);
		if(isMaxOtp) {
			throw new 
			Exception("12-Maksimal OTP sudah tercapai untuk hari ini");
		}
		
		//3. Set Expired Date Token
		//Ambil Waktu sekarang
		Long waktuMilisSekarang = System.currentTimeMillis();
		//Nambah Waktu/Milis
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		Date dateExpired = new Date(waktuMilisExpired);
		
		//Generate Token
		String generatedToken = getAlphaNumericString(10);
		
		//4. Insert OTP ke Table
		tokenomicRepo.insertToken(generatedToken,
				mail,
				"Register",
				dateExpired);
		
		//5. Kirim OTP ke email
		String subjek = "Request OTP Register POS 310";
		String recipient = mail;
		String msgBody = "OTP Anda adalah : " + generatedToken;
		emailService.sendEmail(subjek, recipient, msgBody);
	}

	// function to generate a random string of length n
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
		//Cek Validasi apakah OTP sesuai?
		Boolean isOtpCorrect = tokenomicRepo.isOtpCorrect(mail, otp);
		if (isOtpCorrect == false) {
			throw new Exception("13-OTP tidak sesuai");
		}
		
		//Cek Validasi apakah OTP Expired?
		Boolean isOtpExpired = tokenomicRepo.isOtpExpired(mail, otp);
		if (isOtpExpired) {
			throw new Exception("14-OTP sudah expired");
		}
		
	}

	public List<RoleDTO> getAllRole() {
		// TODO Auto-generated method stub
		return roleRepository.getAllRole();
	}

	public void registerUser(String mail,
			String password,
			String name, 
			Long role_id) {
		
		Long biodataId = biodataRepository.saveBiodataRegister(name);
		
		useraseraRepo.saveUserRegister(mail, password, role_id, biodataId);
	}
	
	
}
