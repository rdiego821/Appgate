package com.appgate.operations.service;

import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {

	@Override
	public void performOperation(String operationName) {
		System.out.println("cooper");
	}

}
