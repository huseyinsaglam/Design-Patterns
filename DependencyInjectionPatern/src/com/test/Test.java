package com.test;


import com.dependecyinjecition.Araba;
import com.dependecyinjecition.Motor;
import com.dependecyinjecition.Otobus;
import com.dependecyinjecition.Vasita;

public class Test {

	public static void main(String[] args) {
		
		
		
		Vasita vasitaAraba = new Vasita(new Araba());
        vasitaAraba.Kullan();
        //veya
        Vasita vasitaOtobus = new Vasita(new Otobus());
        vasitaOtobus.Kullan();
        //veya
        Vasita vasitaMotor = new Vasita(new Motor());
        vasitaMotor.Kullan();
	}

}
