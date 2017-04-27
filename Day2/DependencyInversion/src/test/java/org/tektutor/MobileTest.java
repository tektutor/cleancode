package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

class DummyCamera implements ICamera {

	public boolean ON() {
		System.out.println ("Dummy camera ON method invoked ...");
		return true;
	}

}

public class MobileTest {

	@Test
	public void testPowerOnWhenCameraOnSucceeds() {

		//Mocking
		ICamera mockedCamera = mock ( ICamera.class );

		//Stubbing - hard coding the response of dependent method
		when ( mockedCamera.ON() ).thenReturn ( true );
		
			                   //Dependency Injection or Dependency Inversion
                                           //Inversion of Control (IOC)
					   //Constructor Dependency Injection
		Mobile mobile = new Mobile( mockedCamera );
		//Mobile mobile = new Mobile( new DummyCamera() );
		assertTrue ( mobile.powerOn() );

	} 

}
















