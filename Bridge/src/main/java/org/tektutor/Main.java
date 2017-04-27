package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		Mobile iphone6 = new IPhone6("IPhone6", new Airtel() );
		iphone6.makeCall(1234);
	
	}

}
