package com.ErrorModel;

public class DbError implements ErrorModel{

	@Override
	public void errorNumber() {
		System.out.println("errorNumber : DbError errorNumber");
		
	}

	@Override
	public void description() {
		System.out.println("description : DbError description");
		
	}
	
	@Override
	public void sendMail() {
		System.out.println("DbError Send Mail");
		
	}

}
