package com.nt.Beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle {
	private String beanid;
	
	public Veichle() {
		System.out.println("Veichle.Veichle()===>0-Param");
	}

	/*public Veichle(String beanid) {
		System.out.println("Veichle.Veichle()===>1-Param");
		this.beanid = beanid;
	}
	*/

	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}


	public void journey() {
		ApplicationContext ctx=null;
		Engine engg=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		engg=ctx.getBean(beanid,Engine.class);
		engg.start();
		System.out.println("Journey Started....");
		engg.stop();
	}
}
