package com.ChainOfResponsbilitiy;

public class ZeroProcessor implements Chain{
	
	
	Chain _nextInChain;

	@Override
	public void setNext(Chain nextInChain) {
		
		_nextInChain = nextInChain;
	}

	@Override
	public void process(Number request) {
		
		if(request.getNumber() == 0)
		{
			System.out.println("ZeroProcessor : " + request.getNumber());
		}
		
		else
		{
			_nextInChain.process(request);
		}
		
	}

}
