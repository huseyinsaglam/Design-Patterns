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


/*  Yukar�daki kod blo�unu incelerseniz e�er yaz�n�n ba��nda da anlatt���m gibi 
  �Vasita� s�n�f� �Araba� s�n�f�na ba�l� bir vaziyet arz etmektedir. 
  Yani ben ne zaman �Araba� s�n�f�nda bir de�i�iklik yapsam gelip �Vasita�
   s�n�f�nda da o de�i�ikli�e g�re �al��ma ger�ekle�tirmem gerekebilir. 
   Haliyle onlarca s�n�f s�z konusu oldu�u durumlarda bu pek m�mk�n olmayacakt�r.

�imdi d���n�n ki, �Vasita� s�n�f�na �Araba� yerine �Otobus� class� vermek durumunda kal�rsam 
e�er gelip burada ki komutlar� g�ncellemek zorunda kalaca��m. 
Haliyle sabahtan beri bahsetti�im onlarca s�n�f durumunda ba��ml�l�k
 arz eden s�n�flarda g�ncelleme yapmak hi� yaz�l�mc� i�i de�ildir.

��te� �Araba s�n�f� istedi�i kadar de�i�sin ama Vasita s�n�f�n�n bundan haberi olmas�n. 
Haberi olmas�n ki Vasita s�n�f�yla u�ra�mak zorunda kalmayay�m� diyorsak e�er 
Dependency Injection(DI) tasar�m�n� uygulayaca��z.  */
 