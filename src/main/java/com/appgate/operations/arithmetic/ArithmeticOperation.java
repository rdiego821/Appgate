package com.appgate.operations.arithmetic;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ArithmeticOperation {
	protected ArrayList<Double> operands = new ArrayList<Double>(Arrays.asList(3.2, 1.0, 4.3));
	
	public ArrayList<Double> getOperands() {
		return operands;
	}
	
	public abstract double performOperation(); 
}
