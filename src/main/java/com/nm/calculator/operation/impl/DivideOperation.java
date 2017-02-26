package com.nm.calculator.operation.impl;

import com.nm.calculator.operation.MathematicalOperation;

/**
 * Implementation for Divide operation. 
 * @author Neha Mahajan
 *
 */
public class DivideOperation implements MathematicalOperation {

	@Override
	public float execute(String[] arguments) {
		if ((arguments.length == 2) && !arguments[1].equals("0"))
			return Float.parseFloat(arguments[0]) / Float.parseFloat(arguments[1]);
		else {
			System.err.println("Invalid division");
			return 0f;
		}

	}

}
