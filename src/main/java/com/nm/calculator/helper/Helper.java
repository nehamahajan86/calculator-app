package com.nm.calculator.helper;

import java.util.Arrays;
import java.util.regex.Pattern;

import com.nm.calculator.common.Constants;
import com.nm.calculator.common.Operator;

/**
 * Helper class to find the Operands or Operator from the input stream.
 * @author Neha Mahajan
 *
 */
public class Helper {

	public static String getStringOperator(String[] args) {
		String operator = Arrays.stream(args).filter(op -> Operator.getEnum(op) != null).findFirst().get();
		return Operator.getEnum(operator).toString();
	}

	public static String[] getOperands(String[] args) {
		String[] operands = Arrays.stream(args).filter(op -> Pattern.matches(Constants.OperandRegex, op))
				.toArray(String[]::new);
		return operands;
	}
}
