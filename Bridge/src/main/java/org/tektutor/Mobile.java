package org.tektutor;

public abstract class Mobile {

	protected String name;
	protected ISIM simCard;

	public Mobile( String name, ISIM simCard ) {
		this.name = name;
		this.simCard = simCard;
	}

	public void makeCall ( int mobileNumber ) {
		System.out.println ( "Calling from " + name + " using " + simCard.getName() ); 
	}

}
