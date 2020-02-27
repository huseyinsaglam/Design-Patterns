package com.Proxy;

public class CreditManagerProxy implements CreditBase {
	
	
	private CreditManager _creditManager;
    private int _cachedValue;

	@Override
	public int Calculate() {
		
		 if (_creditManager==null)
         {
             _creditManager=new CreditManager();
             _cachedValue = _creditManager.Calculate();
         }

         return _cachedValue;
         
	}

}
