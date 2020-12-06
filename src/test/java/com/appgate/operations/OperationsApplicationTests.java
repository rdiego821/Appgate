package com.appgate.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.appgate.operations.arithmetic.Addition;
import com.appgate.operations.arithmetic.Division;
import com.appgate.operations.arithmetic.Multiplication;
import com.appgate.operations.arithmetic.Potentiation;
import com.appgate.operations.arithmetic.Substraction;

@SpringBootTest
class OperationsApplicationTests {

	private final Addition addition = new Addition();
	private final Substraction substraction = new Substraction();
	private final Multiplication multiplication = new Multiplication();
	private final Division division = new Division();
	private final Potentiation potentiation = new Potentiation();
	
	private ArrayList<Double> operands = new ArrayList<Double>();
	
	@BeforeEach
	public void addOperands() {
		operands.add((double) 2);
		operands.add((double) 3);
		operands.add((double) 2);
	}
	
	@Test
	void addition() {
		assertEquals(7, addition.performOperation(operands));
    }
	
	@Test
	void substraction() {
		assertEquals(-3, substraction.performOperation(operands));
    }

	@Test
	void multiplication() {
		assertEquals(12, multiplication.performOperation(operands));
    }
	
	@Test
	void division() {
		assertEquals(0.3333333333333333, division.performOperation(operands));
    }
	
	@Test
	void potentiation() {
		assertEquals(64, potentiation.performOperation(operands));
    }
}
