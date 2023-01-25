package id.bootcamp.java310.pos.services;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.repositories.TokenRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class RegisterService {

	@Autowired
	private UserRepository usrep;

	@Autowired
	private TokenRepository tokrep;

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

}
