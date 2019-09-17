package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Beans.Customer;

public class CheckCustomerBankAccnt {

	public static void main(String[] args) {
		
		//create Ioc Container..
		ApplicationContext ctx=null;
		Customer cstmr=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
		//call getBean()..
		cstmr=ctx.getBean("customer",Customer.class);
		System.out.println(cstmr);

	}

}
