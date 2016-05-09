package com.java.designPatterns.adapterOfClass;

public class TestAdapter {
	public static void main(String[] args){
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
