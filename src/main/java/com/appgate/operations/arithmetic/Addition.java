package com.appgate.operations.arithmetic;

import java.util.ArrayList;

public class Addition implements IArithmeticOperation{
	public double performOperation(ArrayList<Double> operands) {
		return operands.stream().reduce((double) 0, (a, b) -> a + b);
	}
}
