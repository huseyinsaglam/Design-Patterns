package abstractFactoryDesign;

import islemci.I5_Islemci;
import islemci.Islemci;
import ram.RAM;
import ram.SEKiZ_RAM;

public class MODEL2 extends PC_ABSTRACTFACTORY{

	@Override
	public Islemci CreateIslemci() {
		
		return new I5_Islemci();
	}

	@Override
	public RAM CreateRAM() {
		
		return new SEKiZ_RAM();
	}

}
