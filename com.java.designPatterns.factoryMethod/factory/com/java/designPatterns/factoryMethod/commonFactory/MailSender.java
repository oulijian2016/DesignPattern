package com.java.designPatterns.factoryMethod.commonFactory;

/**
 * ʵ����1
 * @author oulijian
 *
 */
public class MailSender implements Sender {

	public void send() {
		System.out.println("this is a MailSender!");
	}
}
