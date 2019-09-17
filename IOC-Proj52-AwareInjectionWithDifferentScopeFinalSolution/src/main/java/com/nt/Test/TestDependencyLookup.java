package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Engine;
import com.nt.Beans.Veichle;

public class TestDependencyLookup {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Veichle veichle=null,veichle1=null;
		Engine engg=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
	
		veichle=ctx.getBean("veichle",Veichle.class);
		
		veichle1=ctx.getBean("veichle",Veichle.class);
		
		veichle.journey();
		System.out.println("**************************************");
		veichle1.journey();
	
		((AbstractApplicationContext) ctx).close();
		
	}

}
