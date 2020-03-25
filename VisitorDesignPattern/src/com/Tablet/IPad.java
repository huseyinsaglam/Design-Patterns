package com.Tablet;

import com.Visitor.Visitor;

public class IPad extends Tablet{


	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
	}

}
