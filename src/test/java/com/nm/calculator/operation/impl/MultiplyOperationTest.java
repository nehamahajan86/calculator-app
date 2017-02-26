package com.nm.calculator.operation.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplyOperationTest {

	private MultiplyOperation multiplyOperation;
	private String[] input;
	
	@Before
	public void setUp(){
		multiplyOperation = new MultiplyOperation();
	}

	@Test
	public void shouldMultiplyTwoNumbers() {
		input = new String[]{"2","7"};
		Assert.assertEquals(14f, multiplyOperation.execute(input), 0f);
	}
		
	@Test
	public void shouldMultiplyFloatNumbers() {
		input = new String[]{"4","1.5"};
		Assert.assertEquals(6f, multiplyOperation.execute(input), 0f);
	}
	
	@Test
	public void shouldReturnZeroOnMultiplyWithZero() {
		input = new String[]{"2","0"};
		Assert.assertEquals(0f, multiplyOperation.execute(input), 0f);
	}


}
