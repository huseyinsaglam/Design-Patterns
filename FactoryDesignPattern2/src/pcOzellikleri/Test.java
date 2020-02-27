package pcOzellikleri;

import factoryDesign.MODEL1;

public class Test {

	public static void main(String[] args) {
		PcOzellikleri pcOzellikleri = new PcOzellikleri(new MODEL1());
		pcOzellikleri.getPc();
	}

}
