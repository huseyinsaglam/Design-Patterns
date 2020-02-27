package factoryDesign;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		SekilFactory sekilFactory = new SekilFactory();
		
		System.out.println("**************************");
		
		Sekil sekil1 = sekilFactory.getSekil("Kare"); // new Kare();
		sekil1.cizim();
		
		System.out.println("**************************");
		
		Sekil sekil2 = sekilFactory.getSekil("Dirdortgen"); // new Dirdortgen();
		sekil2.cizim();
		
		System.out.println("**************************");
		
		Sekil sekil3 = sekilFactory.getSekil("Daire");  // new Daire();
		sekil3.cizim();
		

	}

}
