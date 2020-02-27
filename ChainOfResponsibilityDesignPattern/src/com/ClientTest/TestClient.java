package com.ClientTest;

import com.ChainOfResponsbilitiy.Chain;
import com.ChainOfResponsbilitiy.NegativeProcessor;
import com.ChainOfResponsbilitiy.PositiveProcessor;
import com.ChainOfResponsbilitiy.ZeroProcessor;
import com.ChainOfResponsbilitiy.Number;;

public class TestClient {

	public static void main(String[] args) {
		
		

        Chain c1 = new NegativeProcessor(); 
        Chain c2 = new ZeroProcessor(); 
        Chain c3 = new PositiveProcessor(); 
        c1.setNext(c2); 
        c2.setNext(c3); 
        
        
        c1.process(new Number(90)); 
        c1.process(new Number(-50)); 
        c1.process(new Number(0)); 
        c1.process(new Number(91)); 
	}

}
