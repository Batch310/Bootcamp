package id.bootcamp.java310.pos.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.RoleDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.CategoryEntity;
import id.bootcamp.java310.pos.entities.UserEntity;
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
	
	
	//milis
	// ganti waktu expired disini
	private final long expiredToken = 1000*60*5;//5 menit

	public void sendRegisterEmailOtp(String mail) throws Exception {
		//1. Validasi email apakah sudah dipakai
		Boolean isEmailExists = ur.checkEmailExists(mail);
		if(isEmailExists) {
			throw new Exception("11-Email sudah terpakai");
		}
		
		//2.  validasi apakah otp sudah maks per email
		Boolean isMaxOtp = tr.isMaxOtp(mail);
		if(isMaxOtp) {
			throw new Exception("12-OTP sudah mencapai jumlah maksimal dalam sehari");
		}
		//3. Set Expired Date Token
		Long waktuMilisSekarang = System.currentTimeMillis();
		Long waktuMilisExpired = waktuMilisSekarang + expiredToken;
		
		Date dateExpired = new Date(waktuMilisExpired);
		
		
		//Generate Token
		String generatedToken = getAlphaNumericString(10);
		
		// 4. Insert OTP ke Table
		tr.insertToken(generatedToken, mail, "Register", dateExpired);
		
		//5. kirim OTP ke Email
		String subject = "Request OTP Register POS 310";
		String recipient = mail;
		String msgBody = "OTP Anda adalah : " + generatedToken;
		es.sendEmail(subject, recipient, msgBody);
		
	}
	// function to generate a random string of length n
	 String getAlphaNumericString(int n)
	 {
	 
	  // choose a Character random from this String
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	 
	  // create StringBuffer size of AlphaNumericString
	  StringBuilder sb = new StringBuilder(n);
	 
	  for (int i = 0; i < n; i++) {
	 
	   // generate a random number between
	   // 0 to AlphaNumericString variable length
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	 
	   // add Character one by one in end of sb
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	 
	  return sb.toString();
	 }
	public void cekRegisterOtp(String mail, String otp) throws Exception {
		// cek validasi apakah otp sesuai
		Boolean isOtpCorrect = tr.isOtpCorrect(mail, otp);
		if(isOtpCorrect == false) {
			throw new Exception("13-OTP tidak sesuai");
		}
		
		// cek validasi apakah otp expired
		Boolean isOtpExp = tr.isOtpExpired(mail, otp);
		if(isOtpExp) {
			throw new Exception("15-OTP sudah expired");
		}
		
	}
	public List<RoleDTO> getAllRole() {
		// TODO Auto-generated method stub
		return rr.getAllRole();
	}
	public void insertRegistrasi(String mail, String password,String name, Long role_id) {
		Long biodata_id =  br.saveBiodataRegister(name);
		ur.saveUserRegister(mail, password, role_id,biodata_id);
		
	}

	
}
