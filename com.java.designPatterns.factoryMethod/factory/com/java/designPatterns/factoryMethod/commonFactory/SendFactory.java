package com.java.designPatterns.factoryMethod.commonFactory;

/**
 * ������
 * @author oulijian
 *
 */
public class SendFactory {
	public Sender produce(String type){
		if(type.equals("mail")){
			return new MailSender();
		}else if(type.equals("sms")){
			return new SmsSender();
		}else{
			System.out.println("��������ȷ������!");
			return null;
		}
	}
}
