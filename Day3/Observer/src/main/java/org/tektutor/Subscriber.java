package org.tektutor;

public class Subscriber {

	private String name;

	public Subscriber ( String name ) {
		this.name = name;
	}

	public void receive ( String message ) {
		System.out.println ( name + " received " + message );
	}

}
