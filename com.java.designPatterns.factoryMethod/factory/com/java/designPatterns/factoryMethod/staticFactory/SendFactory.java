package com.java.designPatterns.factoryMethod.staticFactory;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}

}
