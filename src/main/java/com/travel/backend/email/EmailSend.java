package com.travel.backend.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import javax.mail.MessagingException;
import javax.mail.internet.*;

@Component
public class EmailSend {

	@Autowired
	private JavaMailSender javaMailSender;

	public void send(String to, String subject, String body) throws MessagingException {
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		String line = "";
		ArrayList<String> lines = new ArrayList<>();

		for (int x = 0; x < body.length(); x++) {
			if (body.charAt(x) == '$') {
				lines.add(line);
				line = "";
			} else {
				line += body.charAt(x);
			}
		}
		
		body = "";
		
		for(int x = 0; x < lines.size(); x++) {
			body += lines.get(x)+"<br>";
		}

		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);

		System.out.println(body);
		javaMailSender.send(message);
	}

}
