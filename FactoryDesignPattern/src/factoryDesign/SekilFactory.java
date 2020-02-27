package factoryDesign;

public class SekilFactory {
	
	public Sekil getSekil(String sekilTuru)
	{
		
		
		if(sekilTuru.equalsIgnoreCase("Dirdortgen"))
		{
			return new Dirdortgen();
		}
		else if(sekilTuru.equalsIgnoreCase("Kare"))
		{
			return new Kare();
		}
		if(sekilTuru.equalsIgnoreCase("Daire"))
		{
			return new Daire();
		}
		else {
			return null;
		}
		
	}

}
