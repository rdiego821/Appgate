package com.appgate.operations.arithmetic;

import java.util.ArrayList;

public class Substraction implements IArithmeticOperation {

	public double performOperation(ArrayList<Double> operands) {
	   double result = operands.get(0);
	   
	   for(int i = 1; i < operands.size(); i++){
		   result -= operands.get(i);
	   }
	   return result;
	}
}
