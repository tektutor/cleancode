package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack;
	private Double firstNumber, secondNumber, result;
	private String mathOperators = "+-*/";

	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
	}

	private void extractInputs() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

	private boolean isMathOperator ( String mathOperator ) {
		return mathOperators.contains( mathOperator );
	}

	public double evaluate ( String rpnMathExpression ) {

		String rpnTokens[] = rpnMathExpression.split( " " );	

		IMathOperation mathOperation = null; 

		for ( String token : rpnTokens ) {

			if ( isMathOperator( token ) ) {
				
				extractInputs();
				mathOperation = MathFactory.getObject( token );
				result = mathOperation.evaluate( firstNumber, secondNumber );
				numberStack.push ( result );
			}
			else
				numberStack.push ( Double.parseDouble(token) );
		}

		return numberStack.pop();

	}

}
