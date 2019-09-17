package com.nt.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle {
	
	//private String beanid;
	
	
	/*public Veichle(String beanid) {
		System.out.println("Veichle.Veichle()::1-Param");
		this.beanid = beanid;
	}
	*/

	public void Entertainment() {
		System.out.println("Veichle.Entertainment()=====>Sound box is ready..");
	}
	
	public void skodaHorn() {
		System.out.println("Veichle.skodaHorn()=======>Skoda Horn Ready...");
	}
	
	/*
	 * public void journey() { 
	 * ApplicationContext ctx=null; 
	 * Engine engg=null;
	 * ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
	 * engg=ctx.getBean(beanid,Engine.class); 
	 * engg.start();
	 * System.out.println("Veichle.journey()=====>Journey Started..."); 
	 * engg.stop();
	 * }
	 * 
	 **/
	/*public void journey(ApplicationContext ctx) {
		Engine engg=null;
		engg=ctx.getBean(beanid,Engine.class);
		engg.start();
		System.out.println("Veichle.journey()=====>Journey Started...");
		engg.stop();
	}
	*/
	
	public void journey(ApplicationContext ctx) {
		Engine engg=null;
		engg=ctx.getBean("engg",Engine.class);
		engg.start();
		System.out.println("Veichle.journey()=====>Journey Started...");
		engg.stop();
	}
	 

}
