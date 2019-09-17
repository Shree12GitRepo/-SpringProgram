package com.nt.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class IRCTCFactoryBean implements FactoryBean<IRCTC> {
	
	public IRCTCFactoryBean() {
		System.out.println("IRCTCFactoryBean::0-Param---called");
	}
	
	@Override
	public IRCTC getObject() throws Exception {
		System.out.println("getObject()-----Called");
		return new IRCTC(17834567,"Bishakha Express");
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjectType()----called");
		return IRCTC.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton()---Called");
		return false;
	}
}
