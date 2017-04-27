package org.tektutor;

public class Mobile {

	private ICamera camera = null;

//	public Mobile() {
//		camera = new Camera();
//	}

	public Mobile( ICamera camera ) {
		this.camera = camera;
	}

	public boolean powerOn() {

		System.out.println ( "Mobile powerOn method" );

		if ( camera.ON() ) {
			System.out.println ( "Assume some power ON success scenario logic happens here ...");
		
			return true;
		}

		System.out.println ( "Assume some power ON failure scenario logic happens here ...");

		return false;
	}

}
