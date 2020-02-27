package subject;

import java.util.ArrayList;
import java.util.List;
import observer.*;

import observer.Ogrenci_Velisi_Baba;

public class Subject {
	
	String name = "Name";
	String surname= "Surname";
	int ogr_no = 12345;
	
	public void devamsizlikMesaji(boolean durum)
	{
		if(durum == true)
		{
			System.out.println("Ogrencimiz"+ " " + name + " " + surname + " isimli" + " " +ogr_no + " " +"No" +" " 
		      + "Ogrencimiz bugun devamsizlik yapmistir."  );
			bildirimYapma();
		}
		
	}
	
		
	List<Observer> observers = new ArrayList<Observer>();
	
	public void aboneEkle(Observer observer)
	{
		observers.add(observer);
	}
	public void aboneSil(Observer observer)
	{
		observers.remove(observer);
	}
	public void bildirimYapma()
	{
		for(Observer p : observers)
		{
			p.bilgilendirmeMesaji();
		}
		
	}

}
