package com.java.designPatterns.decorator;

public class Decorator implements Sourceable {
	
	private Sourceable source;
	public Decorator(Sourceable source2){
		this.source = source2;
	}
	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");

	}

}
