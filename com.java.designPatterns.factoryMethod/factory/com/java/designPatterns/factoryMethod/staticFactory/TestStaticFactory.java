package com.java.designPatterns.factoryMethod.staticFactory;

public class TestStaticFactory {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.send();
		
		Sender senderSms = SendFactory.produceSms();
		senderSms.send();
	}

}
