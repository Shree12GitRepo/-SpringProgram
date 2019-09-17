package com.FrontController.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FrontController.Handlerclass.Handler;
import com.FrontController.Handlerclass.SysDate;
import com.FrontController.Handlerclass.SysProperties;

public class SysDateAndSysProperties extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Handler hdlr=null;
		String lvn=null;
		RequestDispatcher rd=null;
		//get ServletPath..
		String path=req.getServletPath();
		try 
		{
			/* start of Pass the Reequest from Browser through given Condition*/
				if(path.equalsIgnoreCase("/Sys_date.do"))
				{
					hdlr=new SysDate();
					System.out.println("Before passing Request");
					hdlr.handle(req, res);
					System.out.println("After Passing Request");
				}
				else if(path.equalsIgnoreCase("/Sys_props.do"))
				{
					hdlr=new SysProperties();
					hdlr.handle(req, res);
					System.out.println("SysDateAndSysProperties.doGet(sysproperties)");
				}
				else
				{
					rd=req.getRequestDispatcher("error.jsp");
					rd.forward(req, res);
				}
			/*end of Pass the Reequest from Browser through given Condition*/
			
			/*Start of Controller pass data to View*/
			/*
			 * if(lvn.equals("date")) { rd=req.getRequestDispatcher("SysDate.jsp");
			 * rd.forward(req, res); } else if(lvn.equals("sysproperties")) {
			 * rd=req.getRequestDispatcher("SysProperties.jsp"); rd.forward(req, res); }
			 */
			/*End of Controller pass data to View*/
		} 
		catch (Exception e) {
			rd=req.getRequestDispatcher("error.jsp");
			rd.forward(req, res);
		}
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
