package com.SDP.TestDrive;

import com.SDP.Engine.Engine;
import com.SDP.Veichle.DiselEngine;
import com.SDP.Veichle.PetorlEngine;
import com.SDP.Veichle.veichle;

public class Journey {
	
	public static void main(String[] args) {
		
		veichle vh1=new veichle(new PetorlEngine());
		vh1.journey("Odiha", "HYD");

	}

}
