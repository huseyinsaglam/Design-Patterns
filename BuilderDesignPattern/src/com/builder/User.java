package com.builder;

public class User {

	    private String firstName;
	    private String surname;
	    private int age;
	    private String phone;
	    private String address;
	    
	    
	    public User(UserBuilder userBuilder)
	    {
	    	this.firstName = userBuilder.firstName;
	    	this.surname = userBuilder.surname;
	    	this.age = userBuilder.age;
	    	this.phone = userBuilder.phone;
	    	this.address = userBuilder.address;
	    	
	    }
	    
	    
	    @Override
	    public String toString() {
	        return "User: " + this.firstName + ", " + this.surname + ", " + this.age + ", " + this.phone + ", " + this.address;
	    }
	    
	    
	    
	    
	    
	    public static class UserBuilder
	    {
	    	private String firstName;
		    private String surname;
		    private int age;
		    private String phone;
		    private String address;
		    
		    
		    public UserBuilder(String firstName,String surname )
		    {
		    	this.firstName = firstName;
		    	this.surname = surname;
		    	
		    }
		    
			
			/*public UserBuilder firstName(String firstName) {
				this.firstName = firstName;
				return this;
			}
			public UserBuilder surname(String surname) {
				this.surname = surname;
				return this;
			}
			*/
			public UserBuilder age(int age) {
				this.age = age;
				return this;
			}
			
			public UserBuilder phone(String phone) {
				this.phone = phone;
				return this;
			}
			
			public UserBuilder address(String address) {
				this.address = address;
				return this;
			}
		    
			public User build()
			{
				
				/* User user = new User(this);
	            return user; */
			
				return new User(this);
				
			}
		    
	    }
}
