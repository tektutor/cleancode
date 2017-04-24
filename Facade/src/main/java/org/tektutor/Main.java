package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		Employee employee = new Employee("Sriram", "", "Jeganathan");

		EmployeeFacade employeeFacade = new  EmployeeFacade( employee );
		System.out.println (employeeFacade.getName());

	}

}
