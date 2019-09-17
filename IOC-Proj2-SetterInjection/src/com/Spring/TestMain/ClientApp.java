package com.Spring.TestMain;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.Spring.SetterInject.SetterInjection;

public class ClientApp {

	public static void main(String[] args) {
		
		ClassPathResource crs=new  ClassPathResource("com/Spring/Cfg/ApplicationContext.xml");
		//set the File in Buildpath
		//ClassPathResource crs=new  ClassPathResource("ApplicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(crs);
		Class<SetterInjection> c=SetterInjection.class;
		SetterInjection setij1=factory.getBean("wmg",c);
		 System.out.println(setij1.generateWishMessage()); 
		 SetterInjection setij2=factory.getBean("ewmg",c);
		
	}

}
