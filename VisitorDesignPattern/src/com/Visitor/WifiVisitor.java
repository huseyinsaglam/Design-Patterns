package com.Visitor;

import com.Tablet.GalaxyTab;
import com.Tablet.IPad;
import com.Tablet.Tablet;

public class WifiVisitor implements Visitor{

	@Override
	public void visit(Tablet tablet) {
		
//		if(tablet == new IPad())
//		{
//			System.out.println("IPad wifi �zelligi a��k");
//		}
		
		
		if(tablet.equals(new IPad()))
		{
			System.out.println("IPad wifi �zelligi a��k");
		}
		
		else if(tablet.equals(new GalaxyTab()) )
		{
			System.out.println("GalaxyTab'�n wifi se�ene�i yoktur.");
		}
		else
		{
			System.out.println("Boyle bir tablet bulunmamaktad�r..");
		}
	}

}
