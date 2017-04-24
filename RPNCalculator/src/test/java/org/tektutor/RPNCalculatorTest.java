package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class RPNCalculatorTest {

	@Test
	public void testSimpleAddition() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate("10 15 +");
		double expectedResult = 25.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate("10 150 +");
		expectedResult = 160.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );
	}	

	@Test
	public void testSimpleSubtraction() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate("15 10 -");
		double expectedResult = 5.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate("100 15 -");
		expectedResult = 85.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

	}

	@Test
	public void testSimpleMultiplication() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate("10 15 + 100 80 - *");
		double expectedResult = 500.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

	}

	@Test
	public void testSimpleDivision() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate("15 3 /");
		double expectedResult = 5.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate("100 5 /");
		expectedResult = 20.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

	}

	@Test
	public void testComplexRPNExpression() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult = rpnCalculator.evaluate("15 3 /");
		double expectedResult = 5.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

		actualResult = rpnCalculator.evaluate("100 5 /");
		expectedResult = 20.0;
		assertEquals ( expectedResult, actualResult, 0.0001 );

	}
}
