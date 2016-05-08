package com.java.designPatterns.factoryMethod.commonFactory;

/**
 * 工厂类
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
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
