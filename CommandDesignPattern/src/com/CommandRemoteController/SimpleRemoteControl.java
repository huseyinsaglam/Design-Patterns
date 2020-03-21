package com.CommandRemoteController;

import com.Command.Command;
import com.Light.LightOnCommand;

public class SimpleRemoteControl {

	
	Command care; 
	  
    public SimpleRemoteControl() 
    { 
    } 
  
    // Command command = new LightOnCommand(light)
    public void setCommand(Command command) 
    { 
        
        // execute 
        care = command; 
    } 
  
    public void buttonWasPressed() 
    { 
        care.execute(); 
    } 
}
