package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println("ClientApp:main");
		//Locate the SpringBEan Configuration File
		FileSystemResource res=null;
		res=new FileSystemResource("src/com/nt/cfgs/ApplicationContext.xml");
		//Activate Bean Factory Container
		
		  @SuppressWarnings("deprecation") 
		  BeanFactory factory= new XmlBeanFactory(res);
		//get Bean class Object..
		WishGenerator bean=(WishGenerator) factory.getBean("wgm");
		String result=bean.generatorWishMessage("Silu");
		System.out.println(result);
		
	}
}
