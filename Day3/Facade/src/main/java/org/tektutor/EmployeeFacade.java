package org.tektutor;

public class EmployeeFacade {

	private Employee employee = null;

	public EmployeeFacade ( Employee employee ) {
		this.employee = employee;
	}

	public String getName() {
		return employee.getFirstName() + " " 
			+ employee.getMiddleName() + " " 
			+ employee.getLastName();
	}

}
