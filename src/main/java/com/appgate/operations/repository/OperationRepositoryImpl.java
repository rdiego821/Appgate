package com.appgate.operations.repository;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class OperationRepositoryImpl implements OperationRepository {
	protected ArrayList<Double> operands = new ArrayList<Double>();
	
	public ArrayList<Double> getOperands() {
		return operands;
	}
	
	public void addOperands(double operand) {
		operands.add(operand);
	}
}
