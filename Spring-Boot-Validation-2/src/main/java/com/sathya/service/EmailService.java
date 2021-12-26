package com.sathya.service;


import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {

	@Autowired
	private JavaMailSender sender;

	Logger LOG=Logger.getLogger(EmailService.class);

	public void sendEmail(String toAddress,String username)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		String text="Dear"+username+" you are successfull register with the site/n regards/n supportteam";
		message.setTo(toAddress);
		message.setText(text);
		message.setSentDate(new java.util.Date());
		message.setSubject("A Mail From Boot");
		try {
			sender.send(message);
			LOG.log(Level.INFO,"Email has been Sent Successfully");
		}
		catch(Exception e)
		{
			LOG.log(Level.ERROR,e.getMessage());
		}
	}

}
