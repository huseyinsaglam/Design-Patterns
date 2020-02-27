package com.test;


import com.model.Person;
import com.prototypeDesign.Employee;
import com.prototypeDesign.Manager;

public class Test2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
	    Person employee = new Employee(1, "huseyin", "saglam");
		
	    Employee employee2 = (Employee) employee;
	    employee2.setCity("adana");
	    employee2.setPhone(123);
	    System.out.println(employee2.toString());
	

	}

}
