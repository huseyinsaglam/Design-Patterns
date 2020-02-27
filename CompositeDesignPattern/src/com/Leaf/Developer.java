package com.Leaf;

import com.Model.Employee;

public class Developer implements Employee{

	private String name; 
    private long empId; 
    private String position;
    
    
	public Developer(long empId, String name, String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
	}


	
	@Override
	public void showEmployeeDetails() {
		
		System.out.println("Developer Employee : " + empId + " " + name + " " + position);
		
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getEmpId() {
		return empId;
	}



	public void setEmpId(long empId) {
		this.empId = empId;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	@Override
	public String toString() {
		return "Developer [name=" + name + ", empId=" + empId + ", position=" + position + "]";
	}
	


    
    
}
