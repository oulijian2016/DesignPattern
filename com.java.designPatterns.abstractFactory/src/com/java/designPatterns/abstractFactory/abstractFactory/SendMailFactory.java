package com.java.designPatterns.abstractFactory.abstractFactory;

public class SendMailFactory implements Provider{

	@Override
	public Sender provide() {
		return new MailSender();
	}

}
