package com.java.designPatterns.visitor;

public interface Subject {
	public void accept(Visitor visitor);
    public String getSubject();
}
