package com.SDP.Veichle;

import com.SDP.Engine.Engine;

public class PetorlEngine implements Engine,Car {

	@Override
	public void start() {
		System.out.println("PetorlEngine.start()");
	}

	@Override
	public void end() {
		System.out.println("PetorlEngine.end()");

	}

	@Override
	public void RangeRover() {
		System.out.println("==========RangRover STarted Now With Petrol Engine=======");
		
	}

	

	

}
