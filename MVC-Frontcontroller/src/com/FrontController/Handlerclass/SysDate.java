package com.FrontController.Handlerclass;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysDate implements Handler {
	Date dt=null;
	RequestDispatcher rd=null;
	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception  {
		dt=new Date();
		rd=req.getRequestDispatcher("");
		req.setAttribute("Sys_date", dt);
		return "date";
	}

}
