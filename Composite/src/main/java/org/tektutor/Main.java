package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		Company sapient = new Company ( "Sapient" );

		Department hrDepartment = new Department("HR Department");
	
		Employee vicePresident = new Employee("Vice President");
	
		Employee director1 = new Employee ("Director1");

		Employee manager1 = new Employee("Manager1");
		Employee manager2 = new Employee("Manager2");

		Employee employee1 = new Employee("Employee 1");
		Employee employee2 = new Employee("Employee 2");
		Employee employee3 = new Employee("Employee 3");
		Employee employee4 = new Employee("Employee 4");
		Employee employee5 = new Employee("Employee 5");

		manager1.addEmployee ( employee1 );
		manager1.addEmployee ( employee2 );
		manager1.addEmployee ( employee3 );

		manager2.addEmployee ( employee4 );
		manager2.addEmployee ( employee5 );

		director1.addEmployee ( manager1 );
		director1.addEmployee ( manager2 );

		vicePresident.addEmployee ( director1 );

		hrDepartment.addEmployee ( vicePresident ); 

		sapient.addDepartment ( hrDepartment );

		sapient.print();
	}

}
