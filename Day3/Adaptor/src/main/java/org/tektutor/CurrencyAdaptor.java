package org.tektutor;

public class CurrencyAdaptor {

	public double getAmountInINR( double amountInUSD ) {

		return amountInUSD * 65;
		
	}

	public static void main ( String args[] ) {
		
		CurrencyAdaptor currencyConverter = new CurrencyAdaptor();

		System.out.println (currencyConverter.getAmountInINR ( 50.0 ) );
	}

}

	
