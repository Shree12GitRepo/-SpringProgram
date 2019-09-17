package com.SDP.Veichle;

import com.SDP.Engine.Engine;

public class veichle {
	private Engine engg;
	private Car car;
	public veichle(Engine engg)
	{
		this.engg=engg;
		this.car=(Car) engg;
		System.out.println("veichle.veichle()");
		
	}
	
	
	public void journey(String Source,String Desti)
	{
		car.RangeRover();
		//start the journey..
		engg.start();
		System.out.println("Journey started from "+Source);
		System.out.println("Reached at "+Desti);
		engg.end();
		
	}
}
