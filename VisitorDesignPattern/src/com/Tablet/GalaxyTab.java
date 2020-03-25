package com.Tablet;

import com.Visitor.Visitor;

public class GalaxyTab extends Tablet {

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
	}
}
