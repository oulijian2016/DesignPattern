package com.java.designPatterns.abstractFactory.abstractFactory;

public class TestAbstractFactory {
	public static void main(String[] args){
		Provider provider = new SendMailFactory();
		Sender sender = provider.provide();
		sender.send();
		
		Provider produceSms = new SendSmsFactory();
		Sender senderSms = produceSms.provide();
		senderSms.send();
		
		Provider produceIpay = new SendIpayFactory();
		Sender senderIpay = produceIpay.provide();
		senderIpay.send();
	}

}
