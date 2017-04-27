package org.tektutor;

public class Camera implements ICamera {

	public boolean ON() {
		System.out.println ("Camera ON invoked");
		System.out.println ("Camera hardware interaction happens here");
		return true;
	}

}
