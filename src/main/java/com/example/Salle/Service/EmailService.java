package com.example.Salle.Service;

import java.nio.charset.Charset;
import java.util.Properties;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;


@Service 
//@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})  
public class EmailService {

    @Autowired
	private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String fromEmail,String toEmail, String subject, String message) {
            	
        SimpleMailMessage mailMessage = new SimpleMailMessage();
       
        mailMessage.setFrom(fromEmail);
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        

    //    mailMessage.setFrom("johndoe@example.com");

        javaMailSender.send(mailMessage);


}


}






/*	@Autowired
public EmailService() {
this.javaMailSender = new EmailBean().javaMailService();
}



    public void sendMail(String fromEmail,String toEmail, String subject, String message) {
       //this.javaMailSender= new EmailBean().javaMailService();
    	
        SimpleMailMessage mailMessage = new SimpleMailMessage();
       
        mailMessage.setFrom(fromEmail);
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        

        mailMessage.setFrom("johndoe@example.com");

        this.javaMailSender.send(mailMessage);*/
	




/*
private EmailService emailService;

@Autowired
  public EmailServices(EmailService emailService) {
	  this.emailService= emailService;
  }

	public void sendEmail(){
		   Email email =null;
		try {
			email = DefaultEmail.builder()
			        .from(new InternetAddress("avekoaveiro@gmail.com"))
			        .replyTo(new InternetAddress("segno.princak@gmail.com"))
			        .to(Lists.newArrayList(new InternetAddress("someone@localhost")))
			        .subject("Lorem ipsum")
			        .body("Lorem ipsum dolor sit amet [...]").build();
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		        //.encoding(Charset.forName("UTF-8")).build();

		   emailService.send(email);
		}*/

/*
  @Bean
    public JavaMailSender javaMailService() {
           JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

           javaMailSender.setHost("smtp.gmail.com");
           javaMailSender.setPort(587);

           javaMailSender.setJavaMailProperties(getMailProperties());
           javaMailSender.setUsername("xxx@gmail.com");
           javaMailSender.setPassword("xxx");

           return javaMailSender;
       }

       private Properties getMailProperties() {
           Properties properties = new Properties();
           properties.setProperty("mail.transport.protocol", "smtp");
           properties.setProperty("mail.smtp.auth", "true");
           properties.setProperty("mail.smtp.starttls.enable", "true");
           properties.setProperty("mail.debug", "true");
           properties.setProperty("mail.smtp.ssl.enable","true");
           properties.setProperty("mail.test-connection","true");
           return properties;
       }
    

}*/
