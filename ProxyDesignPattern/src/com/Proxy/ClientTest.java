package com.Proxy;

public class ClientTest {

	public static void main(String[] args) {
		
		
		 CreditBase manager =new CreditManagerProxy();
         System.out.println(manager.Calculate());
         System.out.println(manager.Calculate());
	}

}
