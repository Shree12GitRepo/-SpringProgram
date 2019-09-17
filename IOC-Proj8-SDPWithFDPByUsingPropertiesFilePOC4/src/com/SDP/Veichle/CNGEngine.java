package com.SDP.Veichle;

import com.SDP.Engine.Engine;

public class CNGEngine implements Engine,Car{

	@Override
	public void start() {
		System.out.println("CNGEngine.start()");

	}

	@Override
	public void end() {
		System.out.println("CNGEngine.end()");

	}

	@Override
	public void RangeRover() {
		System.out.println("Range Rover Started now CNG engine");
		
	}

	

}
