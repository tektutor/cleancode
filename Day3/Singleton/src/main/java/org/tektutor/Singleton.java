package org.tektutor;

import java.lang.ref.WeakReference;

public class Singleton {

	private static WeakReference<Singleton> instance = null;
	private static int count = 0;

	private Singleton() {
		++count;
	}

	public synchronized static Singleton getInstance() {
		if ( instance == null ) 
			instance = new WeakReference<Singleton>(new Singleton());

		return instance.get();
	}

	public void print() {
		System.out.println ("Print method invoked => "+count);
	}

	
	public void finalize() {
		System.out.println ("About to be deleted");	
	}
	

	public static void main ( String args[] ) {
           try {

		Singleton obj1 = Singleton.getInstance();	    	
		obj1.print();

		obj1 = null;

		System.gc();

		Thread.sleep( 2000 );	
	    } catch(Exception e ) { }

	}
}












