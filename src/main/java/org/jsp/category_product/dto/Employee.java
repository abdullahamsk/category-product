package org.jsp.category_product.dto;

public class Employee {

	// make constructor as private
	private Employee() {
		super();
	}

	/*
	private static volatile Employee employee = null;

	
	public static Employee getInstance() {

		if (employee == null) { // t2
			// t1
			synchronized (employee) {
				if (employee == null) {
					employee = new Employee();
				}
			}

		}
		return employee;
	}*/
	
	private static Employee EMPLOYEE = new Employee();
	
	public static Employee getInstance() {
		return EMPLOYEE;
	}
	
	
	
	

}
