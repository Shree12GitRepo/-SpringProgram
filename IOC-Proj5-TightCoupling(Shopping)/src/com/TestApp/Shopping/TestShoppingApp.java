package com.TestApp.Shopping;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.Beans.Shopping.Flipkart;

public class TestShoppingApp {

	public static void main(String[] args) {
	
		//Hold the ApplicationContext path...
		ClassPathResource crs=new ClassPathResource("com/cfgs/Shopping/ApplicationContext.xml");
		
		//create IOC container to Load the XML file..
		BeanFactory factory=new XmlBeanFactory(crs);
		//create Object of Flipkart(Target class)
		Flipkart fkrt=factory.getBean("fkrt",Flipkart.class);
		//call the Shooping method
		String shpng=fkrt.Shopping(new String[]{"Shirt","Pant","Boots"},new float[] {345.45f,1250.45f,567f});
		System.out.println(shpng);
		

	}

}
