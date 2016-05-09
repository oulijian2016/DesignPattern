package com.java.designPatterns.adapterOfObject;

public class Adapter implements Targetable{
	private Source source;
	public Adapter(Source source){
		this.source = source;
	}
	@Override
	public void method2() {
		System.out.println("this is the target method!");
	}

	@Override
	public void method1() {
		source.method1();
		
	}

}
