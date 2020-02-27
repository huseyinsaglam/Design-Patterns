package com.Class;

import com.Facade.CustomerManagerFacade;

public class CustomerManager {
	
	private CustomerManagerFacade customerManagerFacade;
	
	public CustomerManager()
	{
		customerManagerFacade = new CustomerManagerFacade();
	}
	
	
	
	public void save()
	{
		customerManagerFacade.getLogging().log();
		customerManagerFacade.getCaching().cach();
		customerManagerFacade.getValidation().validate();
	}

}
