package com.nm.calculator.validation;

import java.util.regex.Pattern;

import com.nm.calculator.common.Constants;
import com.nm.calculator.common.Operator;

/**
 * Validator class. Checks if the operation is valid. Calls specific validation
 * methods for different operations
 *  
 * @author Neha Mahajan
 *
 */
public class GenericValidator {

	public static boolean isValidOperation(String[] arguments) {
		if (isValidArithmeticOperation(arguments))
			return true;

		return false;

	}

	private static boolean isValidArithmeticOperation(String[] arguments) {
		boolean isValid = false;

		if (arguments.length == 3) {
			isValid = isValidOperand(arguments[0]) & isValidOperator(arguments[1]) & isValidOperand(arguments[2]);
		}
		return isValid;
	}

	private static boolean isValidOperand(String value) {
		return Pattern.matches(Constants.OperandRegex, value);
	}

	private static boolean isValidOperator(String operator) {
		if (operator.length() > 1 && Operator.getEnum(operator) == null) {
			return false;
		}
		return true;
	}
}
