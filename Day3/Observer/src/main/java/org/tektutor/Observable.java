package org.tektutor;

import java.util.ArrayList;

public class Observable {

	private ArrayList<Observer> observers = null;

	public Observable( ) {
		observers = new ArrayList<Observer>();
	}

	public void addObserver ( Observer observer ) {
		observers.add ( observer );
	}

	public void removeObserver ( Observer observer ) {
		observers.add ( observer );
	}

	public void notify ( String message ) {
		for ( Observer observer : observers ) 
			observer.receive( message );
	}
}
