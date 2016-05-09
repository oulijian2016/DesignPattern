package com.java.designPatterns.builder.builder;

public class TestBuilder {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMail(10);
		builder.print(builder.list);
	}

}
