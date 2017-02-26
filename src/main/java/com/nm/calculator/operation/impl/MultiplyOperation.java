package com.nm.calculator.operation.impl;

import com.nm.calculator.operation.MathematicalOperation;

/**
 * Implementation for Multiply operation. 
 * @author Neha Mahajan
 *
 */
public class MultiplyOperation implements MathematicalOperation {

	@Override
	public float execute(String[] arguments) {
		if (arguments.length == 2)
			return Float.parseFloat(arguments[0]) * Float.parseFloat(arguments[1]);
		else {
			System.err.println("Invalid multiplication");
			return 0f;
		}

	}

}
