package com.appgate.operations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.appgate.operations.service.OperationService;
import com.appgate.operations.service.OperationServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class OperationController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OperationServiceImpl.class);  
	
	@Autowired
	private OperationService operationService;
	
	@PostMapping("/operands/{operand}") 
	public String addOperand(@PathVariable double operand) { 
		operationService.addOperand(operand);
		return "ok";
	}
 	
	@PostMapping(value = "/operations/{operation}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double performOperation(@PathVariable String operation, 
    							   @RequestParam(name="isResultAdded", required = false, defaultValue = "false")
    							   boolean isResultAdded) throws Exception {
		try {
			return operationService.performOperation(operation, isResultAdded);
		} catch(Exception ex) {
			log.info(ex.toString());
		}
		return 0;
    }
}
