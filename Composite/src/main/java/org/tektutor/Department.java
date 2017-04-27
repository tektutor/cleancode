package org.tektutor;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> employees;

	public Department ( String name ) {
		this.name = name;

		employees = new ArrayList<Employee>();
	}

	public void addEmployee ( Employee employee ) {
		employees.add ( employee );
	}

	public void print ( ) {
		System.out.println ( name );

		for ( Employee employee : employees ) 
			employee.print();
	}

}
