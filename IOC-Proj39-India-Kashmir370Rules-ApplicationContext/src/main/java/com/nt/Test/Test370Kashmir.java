package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.Beans.India;

public class Test370Kashmir {

	public static void main(String[] args) {
		//create IOC container...
		
		ApplicationContext ctx=null;
		//ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		
		//locate IOC container...
		//India in=ctx.getBean("india",India.class);
		//System.out.println(in);
		//((AbstractApplicationContext) ctx).close();
	}

}
