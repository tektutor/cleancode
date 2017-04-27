package org.tektutor;

public class CarFactory {

	public static ICar getCar ( String typeOfCar ) {

		ICar car = null;

		if ( typeOfCar.equals ( "Maruti 800" ) )
			car = new Maruti800();
		else if ( typeOfCar.equals ( "Audi" ) )
			car = new Audi();
		else if ( typeOfCar.equals ( "BMW" ) )
			car = new BMW();
		else
			car = new NullCar();

		return car;

	}

}
