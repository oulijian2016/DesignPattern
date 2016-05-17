package com.java.designPatterns.strategy;

public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String exp) {
		int[] arrayint = split(exp, "\\+");
		return arrayint[0] + arrayint[1];
	}

}
