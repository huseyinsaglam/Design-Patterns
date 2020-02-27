package com.TestClient;

import com.CompositeDesign.ProjectManager;
import com.Leaf.Developer;
import com.Model.Employee;

public class ClientTest2 {

	public static void main(String[] args) {
		
		
		// https://www.youtube.com/watch?v=Q1jZ4TI6MF4
		
		 Developer dev1 = new Developer(100, "Huseyin Saglam", "Junior Developer"); 
	     Developer dev2 = new Developer(101, "Merve Kartal", "Junior Developer"); 
	     
	     Developer dev3 = new Developer(200, "Okan Karahan", "Junior Developer"); 
	     Developer dev4 = new Developer(201, "Sebahattin Guclu", "Junior Developer"); 
	     
	     
	     ProjectManager p_manager1 = new ProjectManager("James Gosling");
	     p_manager1.addEmployee(dev1);
	     p_manager1.addEmployee(dev2);
	     
	     
	     ProjectManager p_manager2 = new ProjectManager("Bill Gates");
	     p_manager2.addEmployee(dev3);
	     p_manager2.addEmployee(dev4);

	     
	    
	     p_manager1.showEmployeeDetails();
	     p_manager2.showEmployeeDetails();
	    
	     
	     

	}

}
