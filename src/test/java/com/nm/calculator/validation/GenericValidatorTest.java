package com.nm.calculator.validation;

import org.junit.Assert;
import org.junit.Test;

public class GenericValidatorTest {

	String [] inputArr;
	String inputStr;

	@Test
	public void isTrueValidOperation() {
		inputArr = new String[] {"2","*","3"};
		Assert.assertEquals(true, GenericValidator.isValidOperation(inputArr));
	}

	@Test
	public void isFalseValidOperation() {
		inputArr = new String[] {"2","^"};
		Assert.assertEquals(false, GenericValidator.isValidOperation(inputArr));
	}
}
