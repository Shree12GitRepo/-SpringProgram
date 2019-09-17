package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Veichle;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Veichle vl=null;
		
		//create IOC Container...
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		vl=ctx.getBean("veichle",Veichle.class);
		System.out.println(vl);
		
		//close IOC Container...
		((AbstractApplicationContext) ctx).close();

	}//method

}//class
