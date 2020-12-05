package com.appgate.operations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appgate.operations.service.OperationService;

@RestController
@RequestMapping("/api")
public class OperationController {

	@Autowired
	private OperationService operationService;
	
	@PostMapping("/operations/{operation}")
    public void performOperation(@PathVariable String operation) {
		operationService.performOperation(operation);
    }
}
