package com.nt.Test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext ctx=null;
        Date dt=null;
        ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
        
		/* dt=ctx.getBean("dt",Date.class); */
        System.out.println(dt);
        ((AbstractApplicationContext) ctx).close();
    }
}
