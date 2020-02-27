package com.decorator;

public class DecoratorA implements ComponentInterface{

	@Override
	public double operations() {
		
		Component nesne = new Component();
		System.out.println("On siparisiniz toplam fiyat hesaplan�yor");
		double onsiparis = ( (nesne.operations()) - (nesne.operations()*0.15) ) ;
		return onsiparis;
	}

}
