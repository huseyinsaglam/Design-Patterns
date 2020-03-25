package com.VisitorTest;

import com.Tablet.GalaxyTab;
import com.Tablet.IPad;
import com.Visitor.ThreeGVisitor;
import com.Visitor.WifiVisitor;

public class VisitorTest {

	public static void main(String[] args) {
		
		 IPad iPad = new IPad();
		 GalaxyTab galaxyTab = new GalaxyTab();
		 
		 
		 iPad.accept(new WifiVisitor());
		 galaxyTab.accept(new ThreeGVisitor());
	}

}
