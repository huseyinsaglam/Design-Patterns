package com.TestClient;

import com.Communicate.Email;
import com.Communicate.Sms;
import com.StrategyDesign.Notice;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		// Bu sayede sýnýfýmýz if-else kod kalabalýðýndan arýnmýþ da olacaktýr.
		
		
		System.out.println("Mail ile haber vermek istiyorsam");
		Notice notice = new Notice();
		notice.setCommunicate(new Email());
		notice.sendInformation();
		
		
		System.out.println("Sms ile haber vermek istiyorsam");
		Notice notice2 = new Notice();
		notice2.setCommunicate(new Sms());
		notice2.sendInformation();

	}

}
