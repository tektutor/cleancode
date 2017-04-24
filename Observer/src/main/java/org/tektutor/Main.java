package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		IObservable observable = new Observable();

		observable.addObserver ( new Observer( "Jegan" ), "The Hindu" );
		observable.addObserver ( new Observer( "Nitesh" ), "Times Of India" );
		observable.addObserver ( new Observer( "Sriram" ), "The Hindu" );
		observable.addObserver ( new Observer( "Sriram" ), "India Today" );

		observable.notify( "The Hindu" );
		observable.notify( "Times Of India" );

	}

}
