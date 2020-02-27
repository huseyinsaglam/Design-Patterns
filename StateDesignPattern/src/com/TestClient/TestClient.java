package com.TestClient;

import com.State.Context;
import com.State.StartState;
import com.State.StopState;

public class TestClient {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		System.out.println("*******************");
		
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());

	}

}
