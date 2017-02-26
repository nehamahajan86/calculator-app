package com.nm.calculator.operation.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideOperationTest {

	private DivideOperation divideOperation;
	private String[] input;
	
	@Before
	public void setUp(){
		divideOperation = new DivideOperation();
	}

	@Test
	public void shouldDivideTwoNumbers() {
		input = new String[]{"8","2"};
		Assert.assertEquals(4f, divideOperation.execute(input), 0f);
	}
		
	@Test
	public void shouldDivideNegativeNumbers() {
		input = new String[]{"-4","2"};
		Assert.assertEquals(-2f, divideOperation.execute(input), 0f);
	}
	
	@Test
	public void shouldReturnZeroOnDivideByZero() {
		input = new String[]{"1","0"};
		Assert.assertEquals(0f, divideOperation.execute(input), 0f);
	}

}
