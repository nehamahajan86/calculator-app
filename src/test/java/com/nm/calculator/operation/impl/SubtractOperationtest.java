package com.nm.calculator.operation.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractOperationtest {

	private SubtractOperation subtractOperation;
	private String[] input;
	
	@Before
	public void setUp(){
		subtractOperation = new SubtractOperation();
	}

	@Test
	public void shouldSubtractTwoNumbers() {
		input = new String[]{"5","2"};
		Assert.assertEquals(3f, subtractOperation.execute(input), 0f);
	}
		
	@Test
	public void shouldSubtractTwoNegativeNumbers() {
		input = new String[]{"3","-5"};
		Assert.assertEquals(8f, subtractOperation.execute(input), 0f);
	}
	
	@Test
	public void shouldReturnZeroSubtractOneNumber() {
		input = new String[]{"2"};
		Assert.assertEquals(0f, subtractOperation.execute(input), 0f);
	}

}
