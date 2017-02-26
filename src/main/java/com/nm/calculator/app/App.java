package com.nm.calculator.app;

import com.nm.calculator.common.Constants;
import com.nm.calculator.helper.Helper;
import com.nm.calculator.processor.Calculate;
import com.nm.calculator.validation.GenericValidator;

/**
 * This class is the entry point to calculator application.
 * 
 * @author Neha Mahajan
 *
 */
public class App {

	public static void main(String[] args) {

		String result = null;
		boolean isValid = GenericValidator.isValidOperation(args);

		if (isValid) {
			String[] operands = Helper.getOperands(args);
			String operator = Helper.getStringOperator(args);
			Calculate calculate = new Calculate(operator);
			result = calculate.process(operands);
		} else {
			System.err.println("Invalid inputs");
			System.exit(Constants.ERROR);
		}

		System.out.println(result);
	}

}
