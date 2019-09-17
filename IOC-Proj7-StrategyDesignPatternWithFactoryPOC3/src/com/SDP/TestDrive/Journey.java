package com.SDP.TestDrive;

import com.SDP.Engine.Engine;
import com.SDP.Factory.FactoryClassPOC;
import com.SDP.Veichle.DiselEngine;
import com.SDP.Veichle.PetorlEngine;
import com.SDP.Veichle.veichle;

public class Journey {
	
	public static void main(String[] args) {
		
		//call the getInstance() of factroy class..
		//veichle obj=FactoryClassPOC.getInstance("disel");
		veichle obj=FactoryClassPOC.getInstance("petrol");
		obj.journey("Odisha", "Asam");
		

	}

}
