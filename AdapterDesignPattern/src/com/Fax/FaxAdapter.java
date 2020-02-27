package com.Fax;

import com.ErrorModel.ErrorModel;

// Adapter Classý
public class FaxAdapter implements ErrorModel{

	private Fax _fax;
	
	public FaxAdapter(Fax fax)
	{
		_fax=fax;
	}
	
	@Override
	public void errorNumber() {
		
		_fax.faxErrorNumber();
	}

	@Override
	public void description() {
		_fax.faxDescription();
		
	}

	@Override
	public void sendMail() {
		_fax.faxSendMail();
		
	}

}
