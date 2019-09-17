package com.SDP.Veichle;

import com.SDP.Engine.Engine;

public class DiselEngine implements Engine,Car{

	@Override
	public void start() {
		System.out.println("DiselEngine.start()");

	}

	@Override
	public void end() {
		System.out.println("DiselEngine.end()");

	}

	@Override
	public void RangeRover() {
		System.out.println("RangeRover with Disel Engine");
		
	}

	

}
