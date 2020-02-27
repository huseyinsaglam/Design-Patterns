package com.Facade;


import com.Class.Caching;
import com.Class.Logging;
import com.Class.Validation;

public class CustomerManagerFacade {
	
	private Logging logging;
	private Caching caching;
	private Validation validation;

	
	public CustomerManagerFacade()
	{
		logging = new Logging();
		caching = new Caching();
		validation = new Validation();

	}
	
	

	public Logging getLogging() {
		return logging;
	}

	public void setLogging(Logging logging) {
		this.logging = logging;
	}

	public Caching getCaching() {
		return caching;
	}

	public void setCaching(Caching caching) {
		this.caching = caching;
	}

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}
	
	

}
