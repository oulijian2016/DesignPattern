package com.java.designPatterns.abstractFactory.abstractFactory;

public class SendSmsFactory implements Provider{

	@Override
	public Sender provide() {
		return new SmsSender();
	}

}
