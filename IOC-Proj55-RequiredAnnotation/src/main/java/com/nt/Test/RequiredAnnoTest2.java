package com.nt.Test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Engine;
import com.nt.Beans.Veichle;
import com.nt.editor.CustomEngineEditor;

public class RequiredAnnoTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Veichle vl=null;
		BeanPostProcessor bpp=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//create IOC Container...
		reader.loadBeanDefinitions("com/nt/Cfgs/ApplicationContext.xml");
		bpp=factory.getBean("rbpp",BeanPostProcessor.class);
		//register the BeanPostProcessor...
		factory.addBeanPostProcessor(bpp);
		
		//register CustomProperty Editors..
		factory.addPropertyEditorRegistrar(registrar->{
			registrar.registerCustomEditor(Engine.class,new CustomEngineEditor());
		});
		
		vl=factory.getBean("veichle",Veichle.class);
		System.out.println(vl);
		
	}//method

}//class
