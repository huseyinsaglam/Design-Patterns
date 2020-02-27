package com.client;

import com.decorator.Component;
import com.decorator.ComponentInterface;
import com.decorator.DecoratorA;
import com.decorator.DecoratorB;


public class TestClient {
	
	public static void uygulama(ComponentInterface c)
	{
		System.out.println(c.operations());
	}

	public static void main(String[] args) {
		
		System.out.println("Decorator Design Pattern");
		System.out.println("Normal siparisiniz hesaplaniyor..");
		
		ComponentInterface component = new Component();
		
		uygulama(component);
		
		uygulama(new DecoratorA());
		
		uygulama(new DecoratorB());
		
			

	}

}
