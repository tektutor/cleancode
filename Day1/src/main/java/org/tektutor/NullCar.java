package org.tektutor;

public class NullCar implements ICar {

	public void drive() throws UnsupportedCarException {
		System.out.println ( "Perform error log" );
		throw new UnsupportedCarException();
	}

}
