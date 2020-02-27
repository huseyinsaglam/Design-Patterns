package com.testClient;

import com.DesignPattern.GameWorld;
import com.DesignPattern.GameWorldCareTaker;

public class ClientTest {

	public static void main(String[] args) {
		
		
		
		GameWorld gameWorld = new GameWorld();
		gameWorld.setName("huseyin");
		gameWorld.setPopulation(10000);
		System.out.println(gameWorld.toString());
		
		
		GameWorldCareTaker careTaker = new GameWorldCareTaker();
		careTaker.worldMemento= gameWorld.save();
		//System.out.println(gameWorld.toString());
		
		
		gameWorld.setPopulation(gameWorld.getPopulation()+100);
		System.out.println(gameWorld.toString());
		
		gameWorld.undo(careTaker.worldMemento);
		System.out.println(gameWorld.toString());

	}

}
