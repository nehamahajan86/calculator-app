package com.nm.calculator.operation.impl;

import com.nm.calculator.operation.MathematicalOperation;

/**
 * Implementation for Subtract operation. 
 * @author Neha Mahajan
 *
 */
public class SubtractOperation implements MathematicalOperation {

	@Override
	public float execute(String[] arguments) {
		if (arguments.length == 2)
			return Float.parseFloat(arguments[0]) - Float.parseFloat(arguments[1]);
		else {
			System.err.println("Invalid subtraction");
			return 0f;
		}
	}

}
