package com.appgate.operations.service;

public interface OperationService {
	
	public double performOperation(String operationName, boolean isResultAdded, String sessionToUse) throws Exception;
	
	public void addOperand(double operand);
}
