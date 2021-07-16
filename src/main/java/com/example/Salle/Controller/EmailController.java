package com.example.Salle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.Salle.Service.EmailService;
import com.example.Salle.Service.EmailService;

@RestController
@CrossOrigin(origins="*")
public class EmailController {
	
	
	private EmailService emailservice;
	private  final String email = "projetmairie228@gmail.com";
	@Autowired
	public EmailController(EmailService emailservice) {
		this.emailservice = emailservice;
	}

	

    @GetMapping("/sendmail/{mail}/{object}/{message}")
    public String sendmail(@PathVariable String mail,@PathVariable String object,@PathVariable String message) {

       emailservice.sendMail(email,mail,object,message);
       
        return "emailsent";
    }
	
	
}
