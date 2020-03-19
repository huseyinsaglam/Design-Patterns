package com.mediator;

import com.User.User;

public interface ChatRoom {

	  //  kullan�c�lar�n di�er kullan�c�lara bire bir mesaj g�nderebilece�i sohbet uygulamas�n� sim�le ediyoruz.
	 // Mesaj g�ndermek veya almak i�in t�m kullan�c�lar�n sohbet uygulamas�na kay�tl� olmas� gerekir.
	
	public void sendMessage(String msg, String userId);
	 
    void addUser(User user);
}
