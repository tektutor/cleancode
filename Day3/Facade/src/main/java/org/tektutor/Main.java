package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

/*
		Employee sriram = new Employee ( "Sriram", "", "Jeganathan" );


		System.out.println ( sriram.getFirstName() );	
		System.out.println ( sriram.getMiddleName() );	
		System.out.println ( sriram.getLastName() );	

*/
		EmployeeFacade sriram = new EmployeeFacade ( new Employee("Sriram", "", "Jeganathan" ) );
		
		System.out.println ( sriram.getName() );
	}

}
