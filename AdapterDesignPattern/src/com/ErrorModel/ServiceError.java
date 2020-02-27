package com.ErrorModel;

public class ServiceError implements ErrorModel{

	@Override
	public void errorNumber() {
		System.out.println("errorNumber : ServiceError errorNumber");
		
	}

	@Override
	public void description() {
		System.out.println("description : ServiceError description");
		
	}

	@Override
	public void sendMail() {
		System.out.println("ServiceError Send Mail");
		
	}

}
