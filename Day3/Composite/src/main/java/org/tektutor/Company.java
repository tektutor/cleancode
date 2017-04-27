package org.tektutor;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Employee> employees; 
	private ArrayList<Department> departments;

	public Company ( String name ) {
		this.name = name;
		employees = new ArrayList<Employee>();
		departments = new ArrayList<Department>();
	}

	public void addEmployee( Employee employee ) {
		employees.add ( employee );
	}

	public void addDepartment( Department department ) {
		departments.add ( department);
	}

	public void print ( ) {
		System.out.println ( name );

		for ( Employee employee : employees )
			employee.print();

		for ( Department department : departments )
			department.print();
	}
}
