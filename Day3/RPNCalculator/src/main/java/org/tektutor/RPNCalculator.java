package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack = null;
	private double firstNumber, secondNumber, result;

	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
	}

	private void extractInputs() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

	private boolean isMathOperator ( String rpnToken ) {
		String operators = "+-*/";
		return operators.contains ( rpnToken );
	}

	public double evaluate ( String rpnMathExpression ) {

		String rpnTokens[] = rpnMathExpression.split( " " );
		IMathOperation mathOperation = null;
		
		for ( String token : rpnTokens ) {

			if ( isMathOperator (token) ) {
				mathOperation = MathFactory.getObject( token );
				extractInputs();		
				result = mathOperation.evaluate ( firstNumber, secondNumber );
				numberStack.push ( result );
			}
			else 
				numberStack.push ( Double.parseDouble( token ) ) ;
		}
		
		return numberStack.pop();
	}

}
