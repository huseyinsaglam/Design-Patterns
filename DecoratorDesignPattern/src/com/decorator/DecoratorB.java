package com.decorator;

public class DecoratorB implements ComponentInterface{

	@Override
	public double operations() {
		
		Component nesne = new Component();
		double premiumSiparis = ( (nesne.operations()) - (nesne.operations()*0.15) -  (nesne.operations()*0.25) ) ;
		System.out.println("Premium musteriye ek indirim ekleniyor..");
		return premiumSiparis;
		
	}

}
