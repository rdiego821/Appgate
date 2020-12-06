package com.appgate.operations.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	String sessionToUse = "";
	
	@Autowired
	private OperationService operationService;
	
	@GetMapping("/")
	public String newSession(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		model.addAttribute("sessionId", session.getId());
		sessionToUse = session.getId();
		log.info("New session: " + sessionToUse);
		return session.getId();
	}
	
	@PostMapping("/operands/{operand}") 
	public String addOperand(@PathVariable double operand) { 
		if(!sessionToUse.isEmpty()) {
			operationService.addOperand(operand);
			log.info("ok");
			return "ok";
		} else {
			log.info("No new session created");
			return "No new session created";
		}
		
	}
 	
	@PostMapping(value = "/operations/{operation}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double performOperation(@PathVariable String operation, 
    							   @RequestParam(name="isResultAdded", required = false, defaultValue = "false")
    							   boolean isResultAdded) throws Exception {
		try {
			if(!sessionToUse.isEmpty()) {
				return operationService.performOperation(operation, isResultAdded, sessionToUse);
			} else {
				log.info("No new session created");
				throw new Exception("No new session created");
			}
		} catch(Exception ex) {
			log.info(ex.toString());
		}
		return 0;
    }
}
