package com.java.designPatterns.templateMethod;

public class TestTemplateMethod {
	public static void main(String[] args){
		String exp = "8+0";
		AbstractCalculator iPlus = new Plus();
		int result = iPlus.calculate(exp, "\\+");
		System.out.println(result);
	}
}
