package com.java.designPatterns.visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		 visitor.visit(this);
		
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "love";
	}

}
