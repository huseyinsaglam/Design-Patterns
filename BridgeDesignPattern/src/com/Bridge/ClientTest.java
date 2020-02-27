package com.Bridge;

public class ClientTest {

	public static void main(String[] args) {
		
		
		BridgeDesign bridgeDesign = new BridgeDesign(new ImplementationA());
		System.out.println(bridgeDesign.operation());
		
		
		
		BridgeDesign bridgeDesign2 = new BridgeDesign(new ImplementationB());
		System.out.println(bridgeDesign2.operation());
		
		
		
		System.out.println(new BridgeDesign(new ImplementationA()).operation());
		
		
		

	}

}
