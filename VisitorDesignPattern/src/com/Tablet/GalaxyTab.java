package com.Tablet;

import com.Visitor.Visitor;

public class GalaxyTab extends Tablet {

	public void galaxyTabOzellikleri()
	{
		System.out.println("GalaxyTab a ait ozellikler..");
	}
	
	@Override
	public void accept(Visitor visitor) {
		System.out.println("GalaxyTab a Ekstra ozellik eklendigi metotlar..");
		visitor.visit(this);
	}
}
