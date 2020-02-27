package factoryDesign;

import islemci.I7_Islemci;
import islemci.Islemci;

public class MODEL1 implements PC_FACTORY{

	@Override
	public Islemci createIslemci() {
		
		return new I7_Islemci();
	}

}
