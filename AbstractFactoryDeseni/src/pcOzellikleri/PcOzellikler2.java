package pcOzellikleri;


import abstractFactoryDesign.PC_ABSTRACTFACTORY;
import islemci.Islemci;
import ram.RAM;


public class PcOzellikler2 {
		
	private PC_ABSTRACTFACTORY pc_FACTORY;
	public PcOzellikler2(PC_ABSTRACTFACTORY factory){
		pc_FACTORY = factory;	
	}

	public void getPc()
	{
		System.out.println("PC uretimi ozellikleri");		
		pc_FACTORY.CreateIslemci().IslemciTuru();
		pc_FACTORY.CreateRAM().ramTipi();
	}
}
