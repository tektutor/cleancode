package org.tektutor;

import java.util.HashMap;

public class MathFactory {

	private static String className;
	private static HashMap<String,String> classNamesMap;


	static {
		classNamesMap = new HashMap<String,String>();
		
		classNamesMap.put ( "+", "org.tektutor.Addition" );
		classNamesMap.put ( "-", "org.tektutor.Subtraction" );
		classNamesMap.put ( "*", "org.tektutor.Multiplication" );
		classNamesMap.put ( "/", "org.tektutor.Division" );
		classNamesMap.put ( "", "org.tektutor.NullMathOperation" );
	}

	public static IMathOperation getObject ( String mathOperation ) {
		IMathOperation mathObject = null;
		className = classNamesMap.get ( mathOperation );

		try {
		    mathObject = 
			(IMathOperation )Class.forName ( className ).newInstance();
		}
		catch ( Exception e ) {
			e.printStackTrace();
			mathObject = new NullMathOperation();
		}

		return mathObject;
	}

}
