package com.appgate.operations.arithmetic;

import java.util.ArrayList;

import com.appgate.operations.arithmetic.interfaces.IArithmeticOperation;

public class Potentiation implements IArithmeticOperation{
	public double performOperation(ArrayList<Double> operands) {
		double result = operands.get(0);
		   
	    for(int i = 1; i < operands.size(); i++){
		   result = Math.pow(result, operands.get(i));
	    }
	    return result;
	}
}
