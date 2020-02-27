package com.StrategyDesign;

import com.Communicate.Communicate;

public class Notice {
	
	
	Communicate _communicate;

	public Communicate getCommunicate() {
		return _communicate;
	}

	public void setCommunicate(Communicate communicate) {
		_communicate = communicate;
	}
	
	
	 public void sendInformation(){
	        _communicate.send();
	    }
	

}
