package com.appgate.operations.arithmetic;

public class Division extends ArithmeticOperation{

	@Override
	public double performOperation() {
		double result = super.operands.get(0);
		   
	    for(int i = 1; i < super.operands.size(); i++){
		   result /= super.operands.get(i);
	    }
	   
	    return result;
	}

}
