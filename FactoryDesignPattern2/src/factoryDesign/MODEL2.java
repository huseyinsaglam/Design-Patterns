package factoryDesign;

import islemci.I5_Islemci;
import islemci.Islemci;

public class MODEL2 implements PC_FACTORY {

	@Override
	public Islemci createIslemci() {
		
		return new I5_Islemci();
	}
	

}
