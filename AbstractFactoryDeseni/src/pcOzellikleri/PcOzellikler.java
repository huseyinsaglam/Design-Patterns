package pcOzellikleri;


import abstractFactoryDesign.PC_ABSTRACTFACTORY;
import islemci.Islemci;
import ram.RAM;


public class PcOzellikler {
	
	private Islemci islemci;
	private RAM ram;
	
	private PC_ABSTRACTFACTORY pc_FACTORY;
	public PcOzellikler(PC_ABSTRACTFACTORY factory){
		
		pc_FACTORY = factory;
		islemci = pc_FACTORY.CreateIslemci();
		ram = pc_FACTORY.CreateRAM();
		
	}

	public void getPc()
	{
		System.out.println("PC uretimi ozellikleri");
		islemci.IslemciTuru();
		ram.ramTipi();
	}
}
