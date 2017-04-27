package org.tektutor;

public class NullMathOperation implements IMathOperation {

	public double evaluate ( double firstNumber, double secondNumber ) {
		System.out.println ("Perform error handling logic here");
		
		return 0.0;
	}

}
