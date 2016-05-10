package com.java.designPatterns.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
