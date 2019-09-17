package com.nt.Beans;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle implements ApplicationContextAware{
	
	private String beanid;
	
	ApplicationContext ctx=null;
	
	public Veichle() {
		System.out.println("Veichle.Veichle()-->0Param");
	}
	
	
	
	  public Veichle(String beanid) {
	  System.out.println("Veichle.Veichle()::1-Param"); 
	  this.beanid = beanid; 
	  }
	 
	
	 
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	public void Entertainment() {
		System.out.println("Veichle.Entertainment()=====>Dhinka Chika Ganna Playing");
	}
	
	public void skodaHorn() {
		System.out.println("Veichle.skodaHorn()=======>Skoda Sounding");
	}

	


	
	public void journey() {
		Engine engg=null;
		engg=ctx.getBean(beanid,Engine.class);
		engg.start();
		System.out.println("Journey Started");
		 Entertainment();
		engg.stop();
	}
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("*******Veichle.setApplicationContext()*****");
		this.ctx=ctx;
		
	}
	
	

}
