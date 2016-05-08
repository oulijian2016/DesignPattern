package com.java.designPatterns.abstractFactory.abstractFactory;

public class SendIpayFactory implements Provider{

	@Override
	public Sender provide() {
		return new IpaySender();
	}

}
