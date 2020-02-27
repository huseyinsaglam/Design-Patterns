package abstractFactoryDesign;

import islemci.Islemci;
import ram.RAM;

public abstract class PC_ABSTRACTFACTORY {
	
	public abstract Islemci CreateIslemci();
	public abstract RAM CreateRAM();

}
