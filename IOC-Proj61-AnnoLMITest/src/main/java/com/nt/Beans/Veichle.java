package com.nt.Beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("veichle")
public abstract class Veichle {
	
	public Veichle() {
		System.out.println("Veichle.Veichle()===>0-Param");
	}
	
	//create Abstract method which will return the Dependent class object..
	@Lookup
	public abstract Engine createEngineObj();
	
	public void journey() {
		Engine engg=null;
		//get the Dependent class object...
		engg=createEngineObj();
		engg.start();
		System.out.println("Journey Started from Hyd--->Bhubaneswar");
		engg.stop();
		System.out.println("Journey Ended At Bhubaneswar");
	}

}
