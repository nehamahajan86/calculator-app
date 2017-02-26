package com.nm.calculator.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstantsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void shouldReturnIntValue() {
		Assert.assertEquals(1,Constants.ERROR);
	}

}
