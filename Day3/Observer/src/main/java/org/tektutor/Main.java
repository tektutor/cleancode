package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		Agency agent = new Agency("Star Dot Star Agency");

		Subscriber kumar = new Subscriber ("Kumar");
		Subscriber nitesh = new Subscriber ("Nitesh");
		Subscriber sriram = new Subscriber ("Sriram");

		agent.addSubscriber ( "The Hindu", kumar );
		agent.addSubscriber ( "Times of India", nitesh );
		agent.addSubscriber ( "Deccan Herald", nitesh );
		agent.addSubscriber ( "The Hindu", sriram );
		agent.addSubscriber ( "Deccan Herald", sriram );

		agent.notify ( "Deccan Herald" );
		agent.notify ( "Times of India" );

	}

}
