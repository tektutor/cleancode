package org.tektutor;

public class Observer implements IObserver {
	private String name;

	public Observer( String name ) {
		this.name = name;
	}

	public void update ( String message ) {
		System.out.println ( name + " received => " + message );
	}

}
