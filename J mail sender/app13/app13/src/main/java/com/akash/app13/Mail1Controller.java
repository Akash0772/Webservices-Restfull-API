package com.akash.app13;

import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mail1Controller {

	private JavaMailSenderImpl getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setUsername("akashchaurasia617@gmail.com");
	    mailSender.setPassword("North@5678");
	    mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");	    
	    props.put("mail.smtp.auth", true);
	    props.put("mail.smtp.starttls.enable", true);
	    props.put("mail.smtp.starttls.required", true);
	    props.put("mail.smtp.connectiontimeout", 5000);
	    props.put("mail.smtp.timeout", 5000);
	    props.put("mail.smtp.writetimeout", 5000);
	    return mailSender;
	}
	
	@GetMapping("mail5")
	public String sendMailwithSpecicMailAccount(){
		JavaMailSenderImpl javaMailSender = getJavaMailSender();	
		MimeMessage message = javaMailSender.createMimeMessage(); 
		try {
	        MimeMessageHelper helper = new MimeMessageHelper(message, true);
	        helper.setText("<h1>Hello</h1>", true);
	        helper.setSubject("Hello mail");
	        helper.setTo("chaurasiyakash23@gmail.com");
	        javaMailSender.send(message);
	        System.out.println("mail sent");
		}
		catch(Exception ex) {
			System.out.println("exception while sending mail" + ex);
		}
		return "success";		
	}
	
	
}
