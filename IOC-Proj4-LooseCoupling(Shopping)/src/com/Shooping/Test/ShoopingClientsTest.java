package com.Shooping.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.Shooping.Beans.FlipKart;

public class ShoopingClientsTest {

	public static void main(String[] args) {
		//Load the xml File..
		
		ClassPathResource clrs=new ClassPathResource("com/Shooping/cfg/ApplicationContext.xml");
		//create the IOC container to locate XML file..
		BeanFactory factory=new XmlBeanFactory(clrs);
		FlipKart fkt=factory.getBean("fkrt", FlipKart.class);
		//call the Purchase()  by passing multiple items...
		String prchs=fkt.purchase(new String[]{"Shirt","pant","DO"});
		System.out.println(prchs);
		
	}

}
