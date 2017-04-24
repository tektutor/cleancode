package org.tektutor;

import java.util.ArrayList;
import java.util.HashMap;

public class Observable implements IObservable {

	private HashMap<String, ArrayList<Observer>> observersMap;

	public Observable() {
		observersMap = new HashMap<String, ArrayList<Observer>>();

		observersMap.put ( "Times Of India", new ArrayList<Observer>() );
		observersMap.put ( "The Hindu", new ArrayList<Observer>() );
		observersMap.put ( "India Today", new ArrayList<Observer>() );
	}

	public void addObserver ( Observer observer, String magazine ) {
		ArrayList<Observer> observers = observersMap.get ( magazine );
		observers.add ( observer );
	}

	public void notify ( String magazine ) {
		
		ArrayList<Observer> observers = observersMap.get ( magazine );

		for ( Observer observer : observers ) 
			observer.update ( magazine );
	}
}
