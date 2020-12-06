package com.appgate.operations.arithmetic;

public class Multiplication extends ArithmeticOperation{
	@Override
	public double performOperation() {
		return super.operands.stream().reduce((double) 1, (a, b) -> a * b);	  
	}
}
