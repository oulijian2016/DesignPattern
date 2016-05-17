package com.java.designPatterns.strategy;

public class TestStrategy {
	public static void main(String[] args){
		ICalculator iPlus = new Plus();
		int result = iPlus.calculator("2+9");
		System.out.println(result);
	}
}
