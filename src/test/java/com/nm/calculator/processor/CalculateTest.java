package com.nm.calculator.processor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

	private String operator;
	private Calculate calculate;
	private String[] input;

	@After
	public void tearDown() throws Exception {
		operator = null;
		calculate = null;
	}

	@Test
	public void shouldDoAddtionOnTwoNumbers() {
		operator = "PLUS";
		calculate = new Calculate(operator);
		input = new String[] { "4", "2" };
		Assert.assertEquals("6", calculate.process(input));
	}

	@Test
	public void shouldDoDivisionOnTwoNumbers() {
		operator = "DIVIDE";
		calculate = new Calculate(operator);
		input = new String[] { "10", "2.5" };
		Assert.assertEquals("4", calculate.process(input));
	}
	
	@Test
	public void shouldReturnZeroForInvalidOperation() {
		operator = "HASH";
		calculate = new Calculate(operator);
		input = new String[] { "10", "2.5" };
		Assert.assertEquals("0", calculate.process(input));
	}
}
