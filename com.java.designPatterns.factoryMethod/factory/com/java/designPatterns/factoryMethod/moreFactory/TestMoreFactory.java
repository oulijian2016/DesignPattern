package com.java.designPatterns.factoryMethod.moreFactory;

public class TestMoreFactory {

	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		Sender sender = sf.produceMail();
		sender.send();
		
		Sender senderSms = sf.produceSms();
		senderSms.send();

	}

}
