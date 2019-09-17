package com.nt.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.Service.Weatherreport;
import com.nt.Service.WeatherreportImpl;


public class WeatherReportgenerator extends HttpServlet {
	Weatherreport report=null;
	
	@Override
	public void init() throws ServletException {
		System.out.println("WeatherReportgenerator.init()");
		report=new WeatherreportImpl();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//get PrintWriter Object...
		PrintWriter pw=null;
		ServletContext sc1=null,sc2=null;
		RequestDispatcher rd1=null,rd2=null;
		pw=res.getWriter();
		//Set the Content Type...
		res.setContentType("text/html");
		//invoke Service method..
		float celsius=report.weatherReport();
		//creatae ServletContext object...
		sc1=req.getServletContext().getContext("/IOC-Proj47-Servicelocator-WeatherReport-LocalService");
		System.out.println(sc1+"Weather Report");
		//set Attribute On ServletContext...
		sc1.setAttribute("temprature", celsius);
		//pass data from Servlet to JSP...
		//rd1=req.getRequestDispatcher("/WEB-INF/pages/temprature.jsp");
		rd1=req.getRequestDispatcher("/climateCheck");
		
		System.out.println("WeatherReportgenerator.doGet()");
		rd1.forward(req, res);
		pw.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("WeatherReportgenerator.doPost()");
		doGet(request, response);
	}

}
