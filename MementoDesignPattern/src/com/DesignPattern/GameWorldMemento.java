package com.DesignPattern;

public class GameWorldMemento {
	
	
	private String name;
	private int population;
	
	
	public GameWorldMemento(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

}
