package com.nt.Beans;

public class Engine {
	private static int count;
	
	public Engine() {
		count++;
		System.out.println("Engine()::0-param");
	}
	
	public void start() {
		System.out.println("Engine.start()====>Engine Started Occured "+count);
	}
	
	public void stop() {
		System.out.println("Engine.Stop()===========>Engine Stopped Occured "+count);
	}

}
