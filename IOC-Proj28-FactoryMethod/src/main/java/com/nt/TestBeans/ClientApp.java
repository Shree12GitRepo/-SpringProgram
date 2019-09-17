package com.nt.TestBeans;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		//load the Date Class..
		Class c1=factory.getBean("date",Class.class);
		System.out.println(c1);
		System.out.println("-----------------------------");
		//Calendar class Object..
		Calendar cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal);
		System.out.println("-----------------------------");
		//String class Object..
		String s2=factory.getBean("str2",String.class);
		System.out.println(s2);
		System.out.println("-----------------------------");
		String s3=factory.getBean("str3",String.class);
		System.out.println(s3+"---->"+s3.getClass());
		

	}

}
