package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AutoMobiles;

public class TestAutomobiles {

	public static void main(String[] args) {
		//create IOC Container..
		ApplicationContext ctx=null;
		AutoMobiles automobiles=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		//Instanciates the Class..
		automobiles=ctx.getBean("amobs",AutoMobiles.class);
		
		System.out.println(automobiles);
	}

}
