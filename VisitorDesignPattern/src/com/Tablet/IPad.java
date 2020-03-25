package com.Tablet;

import com.Visitor.Visitor;

public class IPad extends Tablet{


	public void ipadOzellikleri()
	{
		System.out.println("ipad a ait ozellikler..");
	}
	
	@Override
	public void accept(Visitor visitor) {
		System.out.println("ipad a Ekstra ozellik eklendigi metotlar..");
		visitor.visit(this);
	}

}
