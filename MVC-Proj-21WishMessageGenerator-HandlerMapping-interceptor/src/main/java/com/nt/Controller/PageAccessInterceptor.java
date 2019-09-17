package com.nt.Controller;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PageAccessInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		Calendar cal=null;
		int hour=0;
		RequestDispatcher rd=null;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		rd=req.getRequestDispatcher("error.jsp");
		
		if(hour<9 || hour>=17)
		{
			rd.forward(req, res);
			return false;
		}
		else {
			return true;
		}
		
		
	}

}
