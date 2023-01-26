package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender jMail;
	
	// Mengambil value dari apk properties
	@Value("${spring.mail.username}")
	private String sender;
	
	public void sendEmail(String subject,String recipient,String msgBody) throws Exception {
		try {
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setFrom(sender);
			mail.setSubject(subject);
			mail.setTo(recipient);
			mail.setText(msgBody);
			
			jMail.send(mail);
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("21-Email gagal dikirim");
		}
		
	}
	
}
