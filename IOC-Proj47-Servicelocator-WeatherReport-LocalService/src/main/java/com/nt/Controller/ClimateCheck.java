package com.nt.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Service.MyCustomService;

public class ClimateCheck extends HttpServlet {
	ApplicationContext ctx=null;
	@Override
	public void init() throws ServletException {
		System.out.println("*******init()*********");
		
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/ApplicationContext.xml");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MyCustomService cs=null;
		//Set ContentType...
		res.setContentType("text/html");
		cs=ctx.getBean("Mcs",MyCustomService.class);
		float weatherreport=cs.getWeatherReport();
		System.out.println(weatherreport);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
