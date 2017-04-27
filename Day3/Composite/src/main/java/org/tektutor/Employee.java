package org.tektutor;

import java.util.ArrayList;

public class Employee {
	private String name;
	private ArrayList<Employee> employees; 

	public Employee ( String name ) {
		this.name = name;
		employees = new ArrayList<Employee>();
	}

	public void addEmployee( Employee employee ) {
		employees.add ( employee );
	}

	public void print ( ) {
		System.out.println ( name );

		for ( Employee employee : employees )
			employee.print();
	}
}
