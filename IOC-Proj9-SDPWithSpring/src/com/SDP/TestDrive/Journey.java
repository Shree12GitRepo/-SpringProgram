package com.SDP.TestDrive;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.SDP.Veichle.veichle;

public class Journey {
	
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/SDP/cfgs/ApplicationContext.xml"));
		veichle veichle=factory.getBean("veichle",veichle.class);
		veichle.journey("Odisha", "Delhi");
	}

}
