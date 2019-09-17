package com.nt.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.BankDetails;
public class BankDetailsTest {
	public static void main(String[] args) {
		//create IOC container..
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		
		//create SBI Bank class Object..
		BankDetails sbi=factory.getBean("SBI",BankDetails.class);
		System.out.println(sbi);
		System.out.println("----------------------------");
		//create SBI Bank class Object..
		BankDetails icici=factory.getBean("ICICI",BankDetails.class);
		System.out.println(icici);
		
		
	}

}
