package pcOzellikleri;

import abstractFactoryDesign.MODEL1;
import abstractFactoryDesign.MODEL2;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("**** MODEL1 PC OZELLÝKLERI ****");
		PcOzellikler2 pcUretimi1 = new PcOzellikler2(new MODEL1());
		pcUretimi1.getPc();
		
		
		System.out.println("**** MODEL2 PC OZELLÝKLERI ****");
		PcOzellikler2 pcUretimi2 = new PcOzellikler2(new MODEL2());
		pcUretimi2.getPc();
		
		

	}

}
