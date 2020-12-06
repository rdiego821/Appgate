package com.appgate.operations.repository;

import java.util.ArrayList;

public interface OperationRepository {
	
	public ArrayList<Double> getOperands();
	
	public void addOperands(double operand); 
}
