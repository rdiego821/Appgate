package com.appgate.operations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appgate.commons.Operation;
import com.appgate.operations.arithmetic.Addition;
import com.appgate.operations.arithmetic.Division;
import com.appgate.operations.arithmetic.Substraction;
import com.appgate.operations.repository.OperationRepository;
import com.appgate.operations.arithmetic.Multiplication;
import com.appgate.operations.arithmetic.Potentiation;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OperationServiceImpl.class);  
	 
	@Autowired
	private OperationRepository operationRepository;
	
	@Override
	@Synchronized
	public double performOperation(String operationName, boolean isResultAdded) throws Exception {
		if(operationRepository.getOperands().size() >= 2) {
			double result = 0;
			
			switch(Operation.valueOf(operationName)) {
				case addition:
					 result = new Addition().performOperation(operationRepository.getOperands());
					 break;
				case substraction:
					 result = new Substraction().performOperation(operationRepository.getOperands());
					 break;
				case multiplication:
					 result = new Multiplication().performOperation(operationRepository.getOperands());
					 break;
				case division:
					 result = new Division().performOperation(operationRepository.getOperands());
					 break;
				case potentiation:
					 result = new Potentiation().performOperation(operationRepository.getOperands());
					 break;
				default:
					    log.info("Operation not available.");
					    throw new Exception("Operation not available.");	 
			}
			
			if(isResultAdded) {
				operationRepository.addOperands(result);
			}
			
			return result;
		} else {
			log.info("Please provide at least 2 operands to perform an operation.");
			throw new Exception("Please provide at least 2 operands to perform an operation.");
		}
	}

	@Override
	@Synchronized
	public void addOperand(double operand) {
		operationRepository.addOperands(operand); 
	}

}
