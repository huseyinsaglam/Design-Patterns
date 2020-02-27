package com.dependecyinjecition;

public class Vasita {
	
	
	 Tasit _tasit;
	    public Vasita(Tasit tasit)
	    {
	        _tasit = tasit;
	    }
	 
	    public void Kullan()
	    {
	        _tasit.GazVer();
	        _tasit.SagaSinyal();
	        _tasit.FrenYap();
	        _tasit.SolaSinyal();
	    }

}
