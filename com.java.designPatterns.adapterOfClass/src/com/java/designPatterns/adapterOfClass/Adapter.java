package com.java.designPatterns.adapterOfClass;

public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the target method!");
	}

}
