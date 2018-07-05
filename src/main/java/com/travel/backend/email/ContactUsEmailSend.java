package com.travel.backend.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class ContactUsEmailSend {

	@Autowired
	private JavaMailSender javaMailSender;

	public void send(ContactUs contactUs) throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		String body = contactUs.getMessage() + "<br><br>" + "Kind regards<br>" + contactUs.getName() + " "
				+ contactUs.getSurname() + "<br>" + contactUs.getEmail();

		helper.setSubject("Contact Us");
		helper.setTo("matsekolenghope120@gmail.com");
		helper.setText(body, true);

		javaMailSender.send(message);
	}
}
