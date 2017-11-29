package com.example.maven.git_with_branch_calculator;

public class Calculator {
	public int add(int firstNr, int secondNr) {
		return firstNr + secondNr;
	}

	public int subtract(int firstNr, int secondNr) {
		return firstNr - secondNr;
	}
	
	public int multiplytract(int firstNr, int secondNr) {
		return firstNr * secondNr;
	}
	
	public int divition(int firstNr, int secondNr) {
		int result = 0;
		try {
			result = firstNr / secondNr;
			
			
		}catch(ArithmeticException e){
			e.getMessage();
		}
		return result;
	}
}
