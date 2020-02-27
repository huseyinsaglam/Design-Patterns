package com.singletonDesignPattern;



public class Singleton {
	
	
	private static Singleton instance;
	private int id=0;
	

	private Singleton()
    {
        
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public static synchronized Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void save()
	{
		System.out.println("saved !!!");
	}


	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.id=10;
		System.out.println(instance.getId());
		
		System.out.println(instance.id +1);
		instance.setId(20);
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2.id +1);

	}

}
