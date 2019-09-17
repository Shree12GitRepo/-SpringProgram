package com.SDP.Factory;

import com.SDP.Engine.Engine;
import com.SDP.Veichle.veichle;

public class FactoryClassPOC {
	public static veichle getInstance(String engType)
	{
		Engine engg=null;
		veichle vchl=null;
		try {
			engg=(Engine) Class.forName(engType).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		vchl=new veichle(engg);
		return vchl;
		
	}
}
