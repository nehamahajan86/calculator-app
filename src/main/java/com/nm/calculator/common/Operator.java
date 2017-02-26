package com.nm.calculator.common;

import java.util.HashMap;
import java.util.Map;

/**
 * This represents the Operations and provides functionality to return Operator Enum name
 * using Hashmap implementation.
 * @author Neha Mahajan
 *
 */
public enum Operator {
	PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

	private String symbol;

	private Operator(String symbol) {
		this.symbol = symbol;
	}

	public String toSymbol() {
		return symbol;
	}

	public final static Map<String, Operator> operatorMap = new HashMap<>();

	static {
		for (Operator operatorEnum : Operator.values()) {
			operatorMap.put(operatorEnum.symbol, operatorEnum);
		}
	}

	/**
	 * This method returns the specific Operator enum for a symbol.
	 * 
	 * @param index: valid values are +,-,*,/
	 * @return
	 */
	public static Operator getEnum(String symbol) {
		return operatorMap.get(symbol);
	}

}