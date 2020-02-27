package com.test;


import com.model.Person;
import com.prototypeDesign.Employee;
import com.prototypeDesign.Manager;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person employee = new Employee(1, "huseyin", "saglam");
		
		//Employee employeeCopy1 = (Employee)employee;
		Employee employeeCopy1 = (Employee) employee.clone();
		employeeCopy1.setCity("ankara");
		employeeCopy1.setPhone(123456);
		System.out.println(employeeCopy1.toString());
		
		//Employee employeeCopy2 = (Employee)employee;
		Employee employeeCopy2 = (Employee) employee.clone();
		employeeCopy2.setName("hasan");
		employeeCopy2.setCity("ankara");
		employeeCopy2.setPhone(123456);
		System.out.println(employeeCopy2.toString());
		
		Person manager = new Manager(1, "huseyin", "saglam");
		
		//Manager managerCopy1 = (Manager)manager;
		Manager managerCopy1 = (Manager) manager.clone();
		managerCopy1.setSirket("Saglam Manager Sirketi");
		managerCopy1.setAddress("K�z�lay - Ankara");
		System.out.println(managerCopy1.toString());
		
		
		//Manager managerCopy2 = (Manager)manager;
		Manager managerCopy2 = (Manager) manager.clone();
		managerCopy2.setName("ali");
		managerCopy2.setSirket("Saglam Manager Sirketi");
		managerCopy2.setAddress("K�z�lay - Ankara");
		System.out.println(managerCopy2.toString());
		
	

	}

}
