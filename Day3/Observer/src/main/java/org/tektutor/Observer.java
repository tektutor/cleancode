package org.tektutor;

public class Observer {

	private String name;

	public Observer ( String name ) {
		this.name = name;
	}

	public void receive ( String message ) {
		System.out.println ( name + " received " + message );
	}

}
