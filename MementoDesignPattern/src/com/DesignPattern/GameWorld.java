package com.DesignPattern;

public class GameWorld {
	
	
	private String name;
	private int population;
	
	
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
	
	
	public GameWorldMemento save()
	{
		
		return new GameWorldMemento(name, population);
	}
	
	
	public void undo(GameWorldMemento memento)
	{
		name = memento.getName();
		population = memento.getPopulation();
		
	}
	
	
	@Override
	public String toString() {
		return "GameWorld [name=" + name + ", population=" + population + "]";
	}
	
	
	
	
	

}
