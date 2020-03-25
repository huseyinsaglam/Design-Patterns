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
			System.out.println("IPad 3G �zelligi secenegi yoktur.");
		}
		
		else if(tablet.equals(new GalaxyTab()))
		{
			System.out.println("GalaxyTab'�n 3G secenegi ac�k.");
		}
		else
		{
			System.out.println("Boyle bir tablet bulunmamaktad�r..");
		}
		
	}

}
