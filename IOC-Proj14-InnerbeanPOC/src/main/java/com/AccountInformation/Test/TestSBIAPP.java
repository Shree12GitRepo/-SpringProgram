package com.AccountInformation.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.AccountInformation.SBI.CustomerOfBank;

public class TestSBIAPP {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=null;
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ApplicationContext/cfgs/ApplicationContext.xml");
		CustomerOfBank COB=factory.getBean("COB",CustomerOfBank.class);
		System.out.println(COB);
		

	}

}
