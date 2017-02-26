package com.nm.calculator.common;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTest {

	@Test
	public void shouldReturnEnum() {
		Assert.assertEquals("PLUS",Operator.getEnum("+").toString());
	}
	
	@Test
	public void shouldReturnNullForInvalidOperator() {
		Assert.assertEquals(null,Operator.getEnum("&"));
	}

}
