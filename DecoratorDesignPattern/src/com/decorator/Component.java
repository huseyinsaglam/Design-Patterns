package com.decorator;

public class Component implements ComponentInterface{
	
	// Dekorator isleminin yapilacagi sinif
	public double cay = 4;
	public double tost = 10;
	public double serpmeKahvalti= 15 ;

	@Override
	public double operations() {
		
		double toplam = cay + tost + serpmeKahvalti;
		return toplam;
	}

}
