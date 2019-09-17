package com.CYCLICDI.TestCyclic;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.CYCLICDI.flipkart.FlipkartShoppingApp;

public class ShoopingTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/CYCLICDI/cfgs/ApplicationContext.xml");
		FlipkartShoppingApp fkrt=factory.getBean("fkrt",FlipkartShoppingApp.class);
		
	}

}
