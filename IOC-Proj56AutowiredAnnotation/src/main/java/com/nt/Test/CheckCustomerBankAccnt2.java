package com.nt.Test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Customer;

public class CheckCustomerBankAccnt2 {

	public static void main(String[] args) {
		
		//create Ioc Container..
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		Customer cstmr=null;
		BeanPostProcessor bpp=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/Cfgs/ApplicationContext.xml");
		bpp=factory.getBean("awbpp",BeanPostProcessor.class);
		factory.addBeanPostProcessor(bpp);
		cstmr=factory.getBean("customer",Customer.class);
		System.out.println(cstmr);
		
	}

}
