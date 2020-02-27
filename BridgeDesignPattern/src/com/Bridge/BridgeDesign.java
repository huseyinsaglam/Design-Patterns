package com.Bridge;

public class BridgeDesign {
	
	Operation _operation;
	
	public BridgeDesign(Operation operation)
	{
		_operation = operation;
	}
	
	public String operation()
	{
		return " Bridge "  + _operation.operationImp();
	}

}
