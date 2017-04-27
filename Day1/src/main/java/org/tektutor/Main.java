package org.tektutor;

public class Main {

	public static void main ( String arg[] ) {

	    try {
		ICar car = CarFactory.getCar ( "" ); 
		car.drive();
	    } 
            catch( Exception e ) {
		e.printStackTrace();
	    }

	}

}
