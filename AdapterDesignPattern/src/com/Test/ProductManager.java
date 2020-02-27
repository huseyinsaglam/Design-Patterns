package com.Test;

import com.ErrorModel.DbError;
import com.ErrorModel.ErrorModel;
import com.Fax.Fax;
import com.Fax.FaxAdapter;


// Client Class
public class ProductManager {
	
	
	private ErrorModel _errorModel;
	
	public ProductManager(ErrorModel errorModel)
	{
		_errorModel = errorModel;
	}
	
	public void save()
    {
		_errorModel.errorNumber();
        _errorModel.description();
        _errorModel.sendMail();
    }

	public static void main(String[] args) {
		//ProductManager productManager=new ProductManager(new DbError());
		Fax fax = new Fax();
		ProductManager productManager=new ProductManager(new FaxAdapter(fax));
		productManager.save();
		
		

	}

}
