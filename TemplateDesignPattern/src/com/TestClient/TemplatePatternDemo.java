package com.TestClient;

import com.template.Cay;
import com.template.Kahve;
import com.template.SicakIcecek;

public class TemplatePatternDemo {

	public static void main(String[] args) {
	
		SicakIcecek sicakIcecek = new Cay();
		sicakIcecek.sicakIcecekHazirla();
		
		System.out.println("\n *************************** \n");
		
		SicakIcecek sicakIcecek2 = new Kahve();
		sicakIcecek2.sicakIcecekHazirla();
	}

}
