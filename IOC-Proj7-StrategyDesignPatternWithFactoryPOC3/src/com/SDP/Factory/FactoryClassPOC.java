package com.SDP.Factory;

import com.SDP.Engine.Engine;
import com.SDP.Veichle.DiselEngine;
import com.SDP.Veichle.PetorlEngine;
import com.SDP.Veichle.veichle;

public class FactoryClassPOC {
	public static veichle getInstance(String engType)
	{
		Engine engg=null;
		if(engType.equalsIgnoreCase("disel"))
		{
			engg=new DiselEngine();
		}
		else if(engType.equalsIgnoreCase("petrol"))
		{
			engg=new PetorlEngine();
			
		}
		else
		{
			throw new IllegalArgumentException("OOPS...Sorry There is No Car Type in this Engine");
		}
		veichle veichle=new veichle(engg);
		return veichle;
	}
}
