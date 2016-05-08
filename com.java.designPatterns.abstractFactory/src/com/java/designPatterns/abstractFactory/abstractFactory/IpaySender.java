package com.java.designPatterns.abstractFactory.abstractFactory;

public class IpaySender implements Sender{

	@Override
	public void send() {
		System.out.println("this is a iPaySender!");
		
	}

}
