package org.tektutor;

public class Main {

	public static void main ( String args[] ) {

		Company sapient = new Company ( "Sapient" );

		Department hrDepartment = new Department ( "HR Department" );
		
		Employee vp = new Employee ( "Rishi - VP" );

		Employee srManager = new Employee ( "Ganesh - Sr.Manager" );
		Employee ramesh = new Employee ( "Ramesh" );
		Employee pooja = new Employee ( "Pooja" );
		Employee rajesh = new Employee ( "Rajesh" );

		
		srManager.addEmployee ( ramesh );
		srManager.addEmployee ( pooja );
		srManager.addEmployee ( rajesh );

		vp.addEmployee ( srManager );

		hrDepartment.addEmployee ( vp );

		sapient.addDepartment ( hrDepartment );

		sapient.print();

	}
}
