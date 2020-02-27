package com.coupled;

public class Vasita {

	
	 Araba araba;
	    public Vasita()
	    {
	        araba = new Araba();
	    }
	 
	    public void Kullan()
	    {
	        araba.GazVer();
	        araba.SagaSinyal();
	        araba.FrenYap();
	        araba.SolaSinyal();
	    }
}


/*  Yukarýdaki kod bloðunu incelerseniz eðer yazýnýn baþýnda da anlattýðým gibi 
  “Vasita” sýnýfý “Araba” sýnýfýna baðlý bir vaziyet arz etmektedir. 
  Yani ben ne zaman “Araba” sýnýfýnda bir deðiþiklik yapsam gelip “Vasita”
   sýnýfýnda da o deðiþikliðe göre çalýþma gerçekleþtirmem gerekebilir. 
   Haliyle onlarca sýnýf söz konusu olduðu durumlarda bu pek mümkün olmayacaktýr.

Þimdi düþünün ki, “Vasita” sýnýfýna “Araba” yerine “Otobus” classý vermek durumunda kalýrsam 
eðer gelip burada ki komutlarý güncellemek zorunda kalacaðým. 
Haliyle sabahtan beri bahsettiðim onlarca sýnýf durumunda baðýmlýlýk
 arz eden sýnýflarda güncelleme yapmak hiç yazýlýmcý iþi deðildir.

Ýþte… “Araba sýnýfý istediði kadar deðiþsin ama Vasita sýnýfýnýn bundan haberi olmasýn. 
Haberi olmasýn ki Vasita sýnýfýyla uðraþmak zorunda kalmayayým” diyorsak eðer 
Dependency Injection(DI) tasarýmýný uygulayacaðýz.  */
 