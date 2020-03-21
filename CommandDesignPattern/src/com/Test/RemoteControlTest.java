package com.Test;

import com.CommandRemoteController.SimpleRemoteControl;
import com.Light.Light;
import com.Light.LightOnCommand;
import com.Stereo.Stereo;
import com.Stereo.StereoOffCommand;
import com.Stereo.StereoOnWithCDCommand;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		 SimpleRemoteControl remote = new SimpleRemoteControl(); 
         Light light = new Light(); 
         Stereo stereo = new Stereo(); 
 
       // we can change command dynamically 
       remote.setCommand(new LightOnCommand(light)); 
       remote.buttonWasPressed(); 
       
       
       remote.setCommand(new StereoOnWithCDCommand(stereo)); 
       remote.buttonWasPressed(); 
       
       
       remote.setCommand(new StereoOffCommand(stereo)); 
       remote.buttonWasPressed(); 
	}

}
