package com.nt.Test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class EventTest2 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml"));
        Date dt=null;
		 dt=factory.getBean("dt",Date.class); 
        System.out.println(dt);
       
    }
}
