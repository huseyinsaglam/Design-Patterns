package abstractFactoryDesign;

import islemci.I7_Islemci;
import islemci.Islemci;
import ram.ONiKi_RAM;
import ram.RAM;

public class MODEL1 extends PC_ABSTRACTFACTORY{

	@Override
	public Islemci CreateIslemci() { // Islemci CreateIslemci = new I7_Islemci();
		
		return new I7_Islemci();
	}

	@Override
	public RAM CreateRAM() { //  RAM CreateRAM = new ONiKi_RAM();
		
		return new ONiKi_RAM();
	}

}
