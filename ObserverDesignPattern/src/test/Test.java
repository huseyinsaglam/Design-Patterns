package test;

import observer.*;
import observer.Ogrenci_Velisi_Abi;
import observer.Ogrenci_Velisi_Anne;
import observer.Ogrenci_Velisi_Baba;
import subject.*;

public class Test {

	public static void main(String[] args) {
		
		Observer anne =   (Observer) new Ogrenci_Velisi_Anne();
		Observer baba =   (Observer) new Ogrenci_Velisi_Baba();
		Observer abi =   (Observer) new Ogrenci_Velisi_Abi();
		
		Subject subject = new Subject();
		subject.aboneEkle(anne);
		subject.aboneEkle(baba);
		// subject.aboneEkle(abi);
		
		boolean durum = true;
		subject.devamsizlikMesaji(durum);
		
	}

}
