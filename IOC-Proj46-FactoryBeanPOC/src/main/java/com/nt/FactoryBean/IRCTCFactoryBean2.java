package com.nt.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class IRCTCFactoryBean2 {
	
	public IRCTCFactoryBean2() {
		System.out.println("IRCTCFactoryBean2::0-Param---called");
	}
	
	
	public IRCTC getIRCTC(){
		System.out.println("getObject()-----Called");
		return new IRCTC(17834567,"Bishakha Express");
	}

	
}
