package org.tektutor;

import java.util.HashMap;

public class MathFactory {

	private static HashMap<String, String> classNameMap = null;

	static {
		classNameMap = new HashMap<String,String>();
		classNameMap.put ( "+", "org.tektutor.Addition" );
		classNameMap.put ( "-", "org.tektutor.Subtraction" );
		classNameMap.put ( "*", "org.tektutor.Multiplication" );
		classNameMap.put ( "/", "org.tektutor.Division" );
	}

	public static IMathOperation getObject ( String mathOperator ) {

		IMathOperation mathOperation = null;

		String className = classNameMap.get ( mathOperator );

		try {
		mathOperation = 
			(IMathOperation)Class.forName( className ).newInstance();
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}

		return mathOperation;

	}

}
