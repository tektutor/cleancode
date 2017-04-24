package org.tektutor;

public class Main {

	public static void main(String[] args) {
		
		//Choice 1 
		Singleton firstInstance = Singleton.getInstance();
		Singleton secondInstance = Singleton.getInstance();
		
		if (firstInstance != secondInstance) {
			System.out.println("Your singleton class is really not a singleton :( ");
		}
		
		//Choice 2
		SingletonEnum first = SingletonEnum.INSTANCE;
		SingletonEnum second = SingletonEnum.INSTANCE;
		
		String msg = new String();
		msg = (first != second) ?  "Not a singleton" : 
			"It works like a singleton class ...";	
		
		System.out.println(msg);


		//Choice 3
		SingletonWeakReference firstRef = SingletonWeakReference.getInstance();
		SingletonWeakReference secondRef = SingletonWeakReference.getInstance();

		msg = ( firstRef != secondRef ) ? "Not a singleton" :
			"It works like a singleton class ...";

		System.out.println(msg);
	}
}
	
