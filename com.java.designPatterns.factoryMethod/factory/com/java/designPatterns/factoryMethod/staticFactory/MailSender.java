package com.java.designPatterns.factoryMethod.staticFactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is a mail send!");

	}

}
