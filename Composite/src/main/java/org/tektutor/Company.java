package org.tektutor;

import java.util.ArrayList;

public class Company {

	private ArrayList<Department> departments;
	private String name;

	public Company ( String name ) {
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public void addDepartment ( Department department ) {
		departments.add ( department );
	}

	public void print() {
		System.out.println ( name );

		for ( Department department : departments )
			department.print();
	}

}
