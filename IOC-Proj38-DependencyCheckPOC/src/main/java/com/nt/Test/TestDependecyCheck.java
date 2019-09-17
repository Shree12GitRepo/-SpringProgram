package com.nt.Test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.Target;

public class TestDependecyCheck {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		factory=new DefaultListableBeanFactory();
		BeanDefinitionReader reader=null;
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		Target tg=factory.getBean("target",Target.class);
		System.out.println(tg);

	}

}
