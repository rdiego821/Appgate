package com.appgate.operations.arithmetic;

public class Addition extends ArithmeticOperation{
	
	@Override
	public double performOperation() {
		return super.operands.stream().reduce((double) 0, (a, b) -> a + b);
	}
}
