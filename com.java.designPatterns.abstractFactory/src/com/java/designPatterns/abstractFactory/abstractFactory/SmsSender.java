package com.java.designPatterns.abstractFactory.abstractFactory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is a smsSender!");

	}

}
