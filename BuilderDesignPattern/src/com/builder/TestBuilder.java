package com.builder;

import com.builder.User.UserBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
            User huseyin = new User.UserBuilder("huseyin", "saglam").address("istanbul").age(26).build();
         
            
            User ali = new User.UserBuilder("ali", "xxxx").address("amerika").age(25).phone("+484454515465").build();
           
            
            
            User john = new User.UserBuilder("john", "yyyyyy").build();
            
            
            
            System.out.println("***********Ciktilar************");
            System.out.println(huseyin);
            System.out.println(ali);
            System.out.println(john);
	
            
	}

}
