package com.nm.calculator.operation.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddOperationTest {

	private AddOperation addOperation;
	private String[] input;
	
	@Before()
	public void setUp()
	{
		addOperation = new AddOperation();
	}
	
	@Test
	public void shouldAddTwoNumbers() {
		input = new String[]{"1","2"};
		Assert.assertEquals(3f, addOperation.execute(input), 0f);
	}
	
	@Test
	public void shouldAddTwoFloatNumbers() {
		input = new String[]{"3.34","6.12"};
		Assert.assertEquals(9.46f, addOperation.execute(input), 0f);
	}
	
	@Test
	public void shouldReturnZeroAddThreeNumbers() {
		input = new String[]{"2","3","4"};
		Assert.assertEquals(0f, addOperation.execute(input), 0f);
	}
}
