package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.SimpleIntrestAmmount;

public class TestSimpleIntrest2 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		SimpleIntrestAmmount amount=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		
		amount=ctx.getBean("sia",SimpleIntrestAmmount.class);
		System.out.println(amount.SimpleIntrst());
		
	}
	
}
