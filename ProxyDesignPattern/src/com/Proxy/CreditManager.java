package com.Proxy;

public class CreditManager implements CreditBase{

	@Override
	public int Calculate() {
		
		 int result = 1;
         for (int i = 1; i < 5; i++)
         {
             result = result* i;
             
             try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }

         return result;
	}

}
