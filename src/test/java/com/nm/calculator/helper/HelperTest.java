package com.nm.calculator.helper;

import org.junit.Assert;
import org.junit.Test;

public class HelperTest {

	private String[] input;
	private String[] expectedOutput;
	private String[] actualOutput;
	
	@Test
	public void shouldReturnMinusOperatorString() {
		input = new String[]{"12","2","-"};
		Assert.assertEquals("MINUS", Helper.getStringOperator(input));
	}

	@Test
	public void shouldReturnDivideOperatorString() {
		input = new String[]{"/","3","-"};
		Assert.assertEquals("DIVIDE", Helper.getStringOperator(input));
	}
	
	@Test
	public void shouldReturnOperandArray() {
		input = new String[]{"1.2","2","-","5"};
		expectedOutput = new String[]{"1.2","2","5"};
		actualOutput =  Helper.getOperands(input);
		Assert.assertArrayEquals(expectedOutput, actualOutput);		
	}
}
