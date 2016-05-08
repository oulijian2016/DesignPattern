package com.java.designPatterns.factoryMethod.commonFactory;

public class TestCommonFactory {
	public static void main(String[] args){
		SendFactory sf = new SendFactory();
		Sender sender = sf.produce("mail");
		sender.send();
	}
}
