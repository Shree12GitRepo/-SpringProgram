package com.nt.Test;



import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.SimpleIntrestAmmount;

public class TestSimpleIntrest3 {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		SimpleIntrestAmmount amount=null;
		BeanFactoryPostProcessor bpp=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/Cfgs/ApplicationContext.xml");
		//get Access to BeanFactoryPostProcessor..
		
		bpp=factory.getBean("cec",BeanFactoryPostProcessor.class);
		bpp.postProcessBeanFactory(factory);
		
		amount=factory.getBean("sia",SimpleIntrestAmmount.class);
		System.out.println(amount.SimpleIntrst());
		
	}
	
}
