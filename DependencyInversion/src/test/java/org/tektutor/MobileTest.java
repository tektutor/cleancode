package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MobileTest {

	@Test
	public void testPowerOn() {

		//Mocking
		ICamera mockedCamera = mock ( ICamera.class );

		//Stubbing
		when( mockedCamera.ON() ).thenReturn ( true );
	
		                            //Dependency Injection
		Mobile mobile = new Mobile( mockedCamera );	
		assertTrue ( mobile.powerOn() );
	}

}
