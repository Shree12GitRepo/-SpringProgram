package com.nt.Beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Veichle {
	private Engine engg;
	public Veichle(Engine engg) {
		System.out.println("Veichle.Veichle()----1-Param");
		this.engg = engg;
	}

	public void journey() {
		engg.start();
		System.out.println("Journey Started");
		engg.stop();
	}
}
