package com.java.designPatterns.builder.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
	List<Sender> list = new ArrayList<Sender>();
	
	public void produceMail(int count){
		for( int i =0; i < count; i++){
			list.add(new MailSend());
		}
	}
	
	public void produceSms(int count){
		for( int i = 0; i < count; i++){
			list.add(new SmsSend());
		}
	}
	
	public void print(List<Sender> list){
		for( int i = 0; i < list.size(); i++){
			list.get(i).send();
		}
	}

}
