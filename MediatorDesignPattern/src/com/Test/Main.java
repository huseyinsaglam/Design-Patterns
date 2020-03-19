package com.Test;

import com.User.ChatUser;
import com.User.User;
import com.mediator.ChatRoom;
import com.mediator.ChatRoomImpl;

public class Main {

	public static void main(String[] args) {
		
		
		   ChatRoom chatroom = new ChatRoomImpl();
		   
		   // User' ler aras� mesajla�may�, g�r��t�rmeyi ( mediator design pattern ) ortamda 
		   // sendMessage ile yapabilmek icin;
		   // User ile ChatRoom daki  (mediator design pattern) sendMessage yi kullanabilmek i�in 
		   // set etmeyi constructor yard�m� ile yapabiliriz
	        User user1 = new ChatUser(chatroom,"1", "Alex");
	        User user2 = new ChatUser(chatroom,"2", "Brian");
	        User user3 = new ChatUser(chatroom,"3", "Charles");
	        User user4 = new ChatUser(chatroom,"4", "David");


	        // chat ortam�na user1, user2 ve user3 ekleme yap�l�yor...
	        chatroom.addUser(user1);
	        chatroom.addUser(user2);
	        chatroom.addUser(user3);
	        chatroom.addUser(user4);
	 
	        user1.send("Hello brian", "2");
	        user2.send("Hey buddy", "1");

	}

}
