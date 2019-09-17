package com.nt.Beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Veichle implements ApplicationContextAware {
	ApplicationContext ctx=null;
	
	public Veichle() {
		System.out.println("Veichle.Veichle()===>0-Param");
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Veichle.setApplicationContext()");
		this.ctx=ctx;
		
	}
	public void journey() {
		Engine engg=null;
		engg=ctx.getBean("engg",Engine.class);
		engg.start();
		System.out.println("Journey Started from Hyd--->Bhubaneswar");
		engg.stop();
		System.out.println("Journey Ended At Bhubaneswar");
	}

}
