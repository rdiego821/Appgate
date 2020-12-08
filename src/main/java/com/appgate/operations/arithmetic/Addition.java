package com.appgate.operations.arithmetic;

import java.util.ArrayList;

import com.appgate.operations.arithmetic.interfaces.IArithmeticOperation;

public class Addition implements IArithmeticOperation{
	public double performOperation(ArrayList<Double> operands) {
		return operands.stream().reduce((double) 0, (a, b) -> a + b);
	}
}
