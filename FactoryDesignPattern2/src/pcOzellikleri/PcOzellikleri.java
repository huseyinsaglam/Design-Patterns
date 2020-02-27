package pcOzellikleri;

import factoryDesign.PC_FACTORY;

public class PcOzellikleri {
	
	private PC_FACTORY pc_FACTORY;
	public PcOzellikleri(PC_FACTORY factory)
	{
		pc_FACTORY = factory;
	}
	
	public void getPc()
	{
		System.out.println("PC uretimi ozellikleri");
		pc_FACTORY.createIslemci().islemciTuru();
	}

}
