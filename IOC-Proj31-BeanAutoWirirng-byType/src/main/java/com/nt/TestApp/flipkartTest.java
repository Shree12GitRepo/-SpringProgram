package com.nt.TestApp;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.Flipkart;

public class flipkartTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		Flipkart fk=factory.getBean("fkrt",Flipkart.class);
		System.out.println(fk);
		System.out.println("-----------Second Flipkart Object---------------");
		Flipkart fk2=factory.getBean("fkrt2",Flipkart.class);
		System.out.println(fk2);

	}

}
