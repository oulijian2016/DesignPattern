package com.java.designPatterns.birdge;

public class MyBridge extends Bridge{
	public void method(){
		getSource().method();
	}
}
