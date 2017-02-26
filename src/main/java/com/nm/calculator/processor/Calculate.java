package com.nm.calculator.processor;

import com.nm.calculator.operation.MathematicalOperation;
import com.nm.calculator.operation.impl.AddOperation;
import com.nm.calculator.operation.impl.DivideOperation;
import com.nm.calculator.operation.impl.MultiplyOperation;
import com.nm.calculator.operation.impl.SubtractOperation;

/**
 * Processor class to call the MathematicalOperation execution for operator initialised.
 * @author Neha Mahajan
 *
 */
public class Calculate {

	private MathematicalOperation mathematicalOperation;
	private String operator;

	public Calculate(String operator) {
		this.operator = operator;
	}

	public String process(String[] operands) {
		float result = 0f;

		switch (this.operator) {
		case "PLUS":
			mathematicalOperation = new AddOperation();
			result = mathematicalOperation.execute(operands);
			break;
		case "MINUS":
			mathematicalOperation = new SubtractOperation();
			result = mathematicalOperation.execute(operands);
			break;
		case "MULTIPLY":
			mathematicalOperation = new MultiplyOperation();
			result = mathematicalOperation.execute(operands);
			break;
		case "DIVIDE":
			mathematicalOperation = new DivideOperation();
			result = mathematicalOperation.execute(operands);
			break;
		default:
			System.err.println("Invalid operation");
		}

		return convertToOutputFormat(result);
	}

	private String convertToOutputFormat(float result) {
		String resultStr;
		if (result == Math.floor(result)) {
			resultStr = Integer.toString((int) result);
		} else {
			resultStr = String.valueOf(result);
		}
		return resultStr;
	}

}
