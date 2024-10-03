package com.resustainability.reisp.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import com.resustainability.reisp.common.EMailSender;
import com.resustainability.reisp.model.IRM;
import com.resustainability.reisp.model.RoleMapping;

public class EMailSender {

private static Logger logger = Logger.getLogger(EMailSender.class);

	/************** G Mail Server Credentials**************************************/
	private static String mailId = "businessapps.appworks@resustainability.com";
	private static String pass = "Appmint@321";
	
	public static Session getSession() {
		Properties prop = new Properties();
		
	
		
		/************** GMAIL Server Starts**************************************/
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
		/************** GMAIL Server ends*************************************/
		
		Session session = Session.getInstance(prop,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailId, pass);
			}
		  });
		return session;
	}
	public boolean send(String toAddress, String subject, String obj, String body, String subject2, String output) throws UnsupportedEncodingException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, NullPointerException {
		boolean isSend = false;		
		try {
			MimeMessage message = new MimeMessage(getSession());
			message.setFrom(new InternetAddress(mailId, subject2));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toAddress));
			message.setRecipients(Message.RecipientType.CC,InternetAddress.parse(obj));
			message.setRecipients(Message.RecipientType.BCC,InternetAddress.parse(mailId));
			message.setSubject(output,"UTF-8");
			Multipart mp = new MimeMultipart();
			MimeBodyPart htmlPart = new MimeBodyPart();
			
			htmlPart.setContent(message, "text/html");
			mp.addBodyPart(htmlPart);
			message.setContent(mp);
			message.setText( body+output,"utf-8", "html");
			
			Transport.send(message);
			logger.info("Email sent successfully");
			isSend = true;
		} catch (MessagingException e) {
			e.printStackTrace();
			logger.error("Exception occured while sending an email: "+e.getMessage());			
		}
		return isSend;
	}
	public boolean sendReInitiate(String toAddress, String subject, String body, RoleMapping obj) throws UnsupportedEncodingException {
		boolean isSend = false;		
		try {
			Message message = new MimeMessage(getSession());
			message.setFrom(new InternetAddress(mailId, "Safety Alerts!"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toAddress));
			message.setRecipients(Message.RecipientType.CC,InternetAddress.parse(mailId));
			message.setRecipients(Message.RecipientType.BCC,InternetAddress.parse(mailId));
			message.setSubject(subject);
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			// Fill the message
			message.setText( body);
			
			Transport.send(message);
			logger.info("Email sent successfully");
			isSend = true;
		} catch (MessagingException e) {
			e.printStackTrace();
			logger.error("Exception occured while sending an email: "+e.getMessage());			
		}
		return isSend;
	}
	public static File convert(MultipartFile file) throws IOException {
	    File convFile = new File(file.getOriginalFilename());
	    convFile.createNewFile();
	    FileOutputStream fos = new FileOutputStream(convFile);
	    fos.write(file.getBytes());
	    fos.close();
	    return convFile;
	}
	
	
}
