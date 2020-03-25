package com.VisitorTest;

import com.Tablet.GalaxyTab;
import com.Tablet.IPad;
import com.Visitor.ThreeGVisitor;
import com.Visitor.WifiVisitor;

public class VisitorTest {

	public static void main(String[] args) {
		
		 IPad iPad = new IPad();
		 GalaxyTab galaxyTab = new GalaxyTab();
		 
		 System.out.println("********** Ekstra Wifi ozellikleri eklenip uyumlu olan tabletler ********** ");
		 iPad.accept(new WifiVisitor());
		 galaxyTab.accept(new WifiVisitor());
		 
		 
		 System.out.println("********** Ekstra 3G ozellikleri eklenip uyumlu olan tabletler ********** ");
		 iPad.accept(new ThreeGVisitor());
		 galaxyTab.accept(new ThreeGVisitor());
	}

}
