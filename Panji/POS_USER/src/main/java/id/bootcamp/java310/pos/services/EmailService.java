package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;

	// Mengambil value dari aplication properties
	@Value("${spring.mail.username}")
	private String sender;

	public void sendEmail(String subject, String recipient, String messageBody) throws Exception {
		try {
			SimpleMailMessage mail = new SimpleMailMessage();

			mail.setFrom(sender);
			mail.setSubject(subject);
			mail.setTo(recipient);
			mail.setText(messageBody);

			jms.send(mail);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("21-Email gagal dikirim");
		}

	}
}
