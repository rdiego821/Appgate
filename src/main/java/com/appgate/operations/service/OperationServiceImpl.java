package com.appgate.operations.service;

import org.springframework.stereotype.Service;
import com.appgate.commons.Operation;
import com.appgate.operations.arithmetic.Addition;
import com.appgate.operations.arithmetic.Division;
import com.appgate.operations.arithmetic.Substraction;
import com.appgate.operations.arithmetic.Multiplication;
import com.appgate.operations.arithmetic.Potentiation;

@Service
public class OperationServiceImpl implements OperationService {

	@Override
	public double performOperation(String operationName) {
		switch(Operation.valueOf(operationName)) {
			case addition:
				 return new Addition().performOperation();
			case substraction:
				 return new Substraction().performOperation();
			case multiplication:
				 return new Multiplication().performOperation();
			case division:
				 return new Division().performOperation();	
			case potentiation:
				 return new Potentiation().performOperation();	 	 
			default: break;	 
		}
		return 0;
	}

}
