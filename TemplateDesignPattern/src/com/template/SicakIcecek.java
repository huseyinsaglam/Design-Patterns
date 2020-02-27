package com.template;

public abstract class SicakIcecek {
	
	
	 public abstract void suKaynat();
	 public abstract void bardagaDoldur();
	 public abstract void servisEt();
	 public abstract void hazirla();
	 
	 
	 
	 public final void sicakIcecekHazirla(){
		   suKaynat();

		   bardagaDoldur();

		   servisEt();
		   
		   hazirla();
	   }

}
