package com.mediator;

import java.util.HashMap;
import java.util.Map;

import com.User.User;

public class ChatRoomImpl implements ChatRoom {

	 private Map<String, User> usersMap = new HashMap<>();
	 
	    @Override
	    public void sendMessage(String msg, String userId) 
	    {
	        User u = usersMap.get(userId);
	        u.receive(msg);
	    }
	 
	    @Override
	    public void addUser(User user) {
	        usersMap.put(user.getId(), user);
	    }
}
