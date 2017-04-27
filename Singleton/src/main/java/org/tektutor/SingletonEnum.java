package org.tektutor;

public enum SingletonEnum {
	INSTANCE;
	
	private SingletonEnum() {
		System.out.println("Enum private constructor");
	}
	
	public void provideSomeService() {
		System.out.println("Provide some meaningful service here ...");
	}	
}
