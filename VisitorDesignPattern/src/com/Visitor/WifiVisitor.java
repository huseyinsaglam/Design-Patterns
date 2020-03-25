package com.Visitor;

import com.Tablet.GalaxyTab;
import com.Tablet.IPad;
import com.Tablet.Tablet;

public class WifiVisitor implements Visitor{

	@Override
	public void visit(Tablet tablet) {
		
//		if(tablet == new IPad())
//		{
//			System.out.println("IPad wifi özelligi açýk");
//		}
		
		
		if(tablet.equals(new IPad()))
		{
			System.out.println("IPad wifi özelligi açýk");
		}
		
		else if(tablet.equals(new GalaxyTab()) )
		{
			System.out.println("GalaxyTab'ýn wifi seçeneði yoktur.");
		}
		else
		{
			System.out.println("Boyle bir tablet bulunmamaktadýr..");
		}
	}

}
