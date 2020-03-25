package com.Visitor;

import com.Tablet.GalaxyTab;
import com.Tablet.IPad;
import com.Tablet.Tablet;

public class ThreeGVisitor implements Visitor{

	@Override
	public void visit(Tablet tablet) {
		
	//	Tablet tablet = new IPad();
		
		if(tablet.equals(new IPad()))
		{
			System.out.println("IPad 3G özelligi secenegi yoktur.");
		}
		
		else if(tablet.equals(new GalaxyTab()))
		{
			System.out.println("GalaxyTab'ýn 3G secenegi acýk.");
		}
		else
		{
			System.out.println("Boyle bir tablet bulunmamaktadýr..");
		}
		
	}

}
