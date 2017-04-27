package org.tektutor;

import java.util.HashMap;
import java.util.ArrayList;

public class Agency {

	private String name;
	private HashMap<String, ArrayList<Subscriber>> magazines;

	public Agency( String name ) {
		magazines = new HashMap<String, ArrayList<Subscriber>>();
		this.name = name;

		magazines.put ( "Times of India", new ArrayList<Subscriber>());
		magazines.put ( "The Hindu", new ArrayList<Subscriber>());
		magazines.put ( "Deccan Herald", new ArrayList<Subscriber>());
	}

	public void addSubscriber ( String magazine, Subscriber subscriber ) {
		ArrayList<Subscriber> subscribers = magazines.get( magazine );
		subscribers.add ( subscriber );
	}
	
	public void notify ( String magazine) {
		ArrayList<Subscriber> subscribers = magazines.get( magazine );
		
		for ( Subscriber subscriber : subscribers ) 
			subscriber.receive( magazine );
	}
}
