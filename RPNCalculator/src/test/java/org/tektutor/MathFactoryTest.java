package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathFactoryTest {

	@Test
	public void testForAdditionObject() {
		IMathOperation mathOperation = MathFactory.getObject ("+");
		assertNotNull ( mathOperation );
	}		

	@Test
	public void testForNullObject() throws NullPointerException {
		IMathOperation mathOperation = MathFactory.getObject ("");
		assertNotNull ( mathOperation ); 
		assertTrue ( mathOperation instanceof NullMathOperation );
		mathOperation.evaluate ( 10, 20 );
	}		


}
