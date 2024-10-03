package com.resustainability.reisp.common;

import java.util.Date;

public class Mail {
	private String mailFrom;

	 private String mailTo;

	 private String mailCc;

	 private String mailBcc;

	 private String mailSubject;

	 private String mailContent;

	 private String templateName;
	 
	 /**
	  * This method will get the mail From
	  * @return type of this method is mail form
	  */
	 public String getMailFrom() {
		return mailFrom;
	}

	/**
	 * This method will set the mail From 
	 * @param mailFrom it is string type variable that hold the mail from.
	 */
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	/**
	 * This method will get the mail to
	 * @return type of this method is mailTo.
	 */
	public String getMailTo() {
		return mailTo;
	}

	/**
	 * This method will set the mail to
	 * @param mailTo it is string type variable that hold the mail to.
	 */
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	/**
	 * This method will get the Mail Cc.
	 * @return type of this method is mailCc.
	 */
	public String getMailCc() {
		return mailCc;
	}

	/**
	 * This method will set the Mail Cc
	 * @param mailCc it is string type variable that hold the mail Cc.
	 */
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}

	/**
	 * This method get the mail Bcc
	 * @return type of this method is mailBcc
	 */
	public String getMailBcc() {
		return mailBcc;
	}

	/**
	 * This method set the Mail Bcc
	 * @param mailBcc it is string type variable that hold the mail bcc
	 */
	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}

	/**
	 * This method get the mail subject
	 * @return type of this method is mailSubject
	 */
	public String getMailSubject() {
		return mailSubject;
	}

	/**
	 * This method set the mail subject
	 * @param mailSubject it is string type variable that hold the mail subject
	 */
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	/**
	 * This method will get the mail content
	 * @return type of this method is mailContent
	 */
	public String getMailContent() {
		return mailContent;
	}

	/**
	 * This method will set the mail content
	 * @param mailContent it is string type variable that hold the mail content
	 */
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	/**
	 * This method get the template name
	 * @return type of this method is templateName.
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * This method set the Template Name
	 * @param templateName it is string type variable that hold the template name.
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	
	/**
	 * This method get the mail send date
	 * @return type of this method is date object
	 */
	public Date getMailSendDate() {
	  return new Date();
	}

	
	@Override
	public String toString() {
	  StringBuilder lBuilder = new StringBuilder();
	  lBuilder.append("Mail From:- ").append(getMailFrom());
	  lBuilder.append("Mail To:- ").append(getMailTo());
	  lBuilder.append("Mail Cc:- ").append(getMailCc());
	  lBuilder.append("Mail Bcc:- ").append(getMailBcc());
	  lBuilder.append("Mail Subject:- ").append(getMailSubject());
	  lBuilder.append("Mail Send Date:- ").append(getMailSendDate());
	  lBuilder.append("Mail Content:- ").append(getMailContent());
	  return lBuilder.toString();
	}
	
}
