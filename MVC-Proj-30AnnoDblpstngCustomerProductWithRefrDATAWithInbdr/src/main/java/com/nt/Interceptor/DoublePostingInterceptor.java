package com.nt.Interceptor;

import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostingInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		//Create Request Dispatcher...
		RequestDispatcher rd=null;
		//create Session Object..
		HttpSession ses=null;
		ses=req.getSession();
		
		int cToken=0,sToken=0;
		if(req.getMethod().equalsIgnoreCase("GET"))
		{
			sToken=new Random().nextInt(1000);
			ses.setAttribute("SToken", sToken);
		}
		else {
			cToken=Integer.parseInt(req.getParameter("SToken"));
			sToken=(int)ses.getAttribute("SToken");
			if(cToken==sToken)
			{
				return true;
			}
			else
			{
				rd=req.getRequestDispatcher("/errors.jsp");
				rd.forward(req, res);
			}
		}
		
		return false;
	}

}
