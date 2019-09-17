package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;

import com.nt.Service.WeatherreportImpl;
import com.nt.Service.WeatherreportImplProxy;

public class ServiceLocator implements FactoryBean<WeatherreportImpl> {

	@Override
	public WeatherreportImpl getObject() throws Exception {
		System.out.println("*********getObject()**********");
		WeatherreportImplProxy proxy= new WeatherreportImplProxy();
		WeatherreportImpl WRprt=proxy.getWeatherreportImpl();
		return WRprt ;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("*********getObjectType()*********");
		return WeatherreportImpl.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("**********isSingleton()**********");
		return true;
	}

}
