package com.java.designPatterns.birdge;

public class TestBridge {
	public static void main(String[] args){
		Bridge bridge = new MyBridge();
		Sourceable sub1 = new Sourcesub1();
		bridge.setSource(sub1);
		bridge.method();
		
		
	}
}
