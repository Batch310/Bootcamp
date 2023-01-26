package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jMail;

	@Value("${spring.mail.username}")
	private String sender;

	public void sendEmail(String subject, String recepient, String msgBody) throws Exception {
		try {

			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setFrom(sender);
			mail.setSubject(subject);
			mail.setTo(recepient);
			mail.setText(msgBody);

			jMail.send(mail);

		} catch (Exception e) {
			//Print errornya
			e.printStackTrace();
			throw new Exception("21-Email gagal kirim");
		}

	}

}
