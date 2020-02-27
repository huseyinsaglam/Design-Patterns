package com.Ornek;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder("huseyin", "saglam").build();
		
		System.out.println(employee);
		
		
		
		Employee employee1 = new Employee.EmployeeBuilder("huseyin", "saglam").age(30).build();

		System.out.println(employee1);

	}

}
