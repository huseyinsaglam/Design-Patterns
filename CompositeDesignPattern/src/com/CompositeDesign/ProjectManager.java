package com.CompositeDesign;

import java.util.ArrayList;
import java.util.List;

import com.Model.Employee;

public class ProjectManager implements Employee{
	
	String name;
	
	List<Employee> empList = new ArrayList<Employee>();


	public ProjectManager(String name) {
		this.name = name;
	}


	@Override
	public void showEmployeeDetails() {
		System.out.println(name);
		for(Employee emp : empList)
		{
			
			emp.showEmployeeDetails();
		}
		
	}
	
	
	 public void addEmployee(Employee emp) 
	    { 
	        empList.add(emp);
	    } 
	       
	    public void removeEmployee(Employee emp) 
	    { 
	       empList.remove(emp);
	    } 
			



}
