package com.nt.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.MobileDetails;

public class MobileDetailsTest {
	public static void main(String[] args) {
		//create IOC container..
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		
		//create MobileDetails class Object..
		MobileDetails mobdt=factory.getBean("mobDet",MobileDetails.class);
		System.out.println(mobdt);
		
		
	}

}
