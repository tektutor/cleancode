package org.tektutor;

public class Mobile {
	private ICamera camera;

	public Mobile ( ) {
		camera = new Camera();
	}

	//Constructor Dependency Injection
	//Inversion of Control a.ka. Dependency Inversion
	public Mobile( ICamera camera ) {
		this.camera = camera;
	}

	public boolean powerOn() {
	
		System.out.println ( "Mobile powerOn method" );

		if ( camera.ON() ) {
			System.out.println ( "Assume some complex logic related to ON is performed here");
			return true;
		}

		System.out.println ( "Assume some complex logic related to ON is performed here");
		return false;
	}
}
