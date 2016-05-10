package com.java.designPatterns.proxy;

public class Proxy implements Sourceable {
	
	private Source source;
	public Proxy(){
		this.source = new Source();
	}
	
	public void method() {
		System.out.println("before proxy!");
		source.method();
		System.out.println("after proxy!");
	}

}
