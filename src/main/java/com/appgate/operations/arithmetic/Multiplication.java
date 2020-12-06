package com.appgate.operations.arithmetic;

import java.util.ArrayList;

public class Multiplication implements IArithmeticOperation{
	public double performOperation(ArrayList<Double> operands) {
		return operands.stream().reduce((double) 1, (a, b) -> a * b);	  
	}
}