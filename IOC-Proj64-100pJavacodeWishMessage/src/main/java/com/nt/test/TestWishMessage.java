package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.Appconfig;
import com.nt.beans.WishmesageGenerator;

public class TestWishMessage {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishmesageGenerator wishMsg=null;
		ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		wishMsg=ctx.getBean("wmg",WishmesageGenerator.class);
		System.out.println(wishMsg.getWishMessage());
		System.out.println(wishMsg);
	}
}
