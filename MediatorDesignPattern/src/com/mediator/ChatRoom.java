package com.mediator;

import com.User.User;

public interface ChatRoom {

	  //  kullanýcýlarýn diðer kullanýcýlara bire bir mesaj gönderebileceði sohbet uygulamasýný simüle ediyoruz.
	 // Mesaj göndermek veya almak için tüm kullanýcýlarýn sohbet uygulamasýna kayýtlý olmasý gerekir.
	
	public void sendMessage(String msg, String userId);
	 
    void addUser(User user);
}
