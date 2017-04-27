package org.tektutor;

public class Mobile {

	protected ISimCard simCard = null;

	public Mobile ( ISimCard simCard ) {
		this.simCard = simCard;
	}

	public void makeCall ( int mobileNumber ) {
		System.out.println ( "Calling " + mobileNumber + " from " 
		    + simCard.getName() + " ..." ); 
	}

}
