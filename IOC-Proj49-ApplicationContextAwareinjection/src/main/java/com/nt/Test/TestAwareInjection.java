package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Veichle;

public class TestAwareInjection {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Veichle veichle=null,veichle1=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		veichle=ctx.getBean("veichle",Veichle.class);
		veichle.journey();
		veichle1=ctx.getBean("veichle",Veichle.class);
		veichle1.journey();
		((AbstractApplicationContext) ctx).close();
	}

}
