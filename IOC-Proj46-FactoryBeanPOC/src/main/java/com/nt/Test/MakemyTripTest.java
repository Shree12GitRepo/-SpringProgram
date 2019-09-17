package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.MakemyTrip;

public class MakemyTripTest {

	public static void main(String[] args) {
		//create IOC Container...
		ApplicationContext ctx=null;
		MakemyTrip mktrip=null,mktrip2=null;
		//load XML...
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		//call getBean()..
		mktrip=ctx.getBean("mktrp2",MakemyTrip.class);
		mktrip.trainTicket();
		
	}

}
