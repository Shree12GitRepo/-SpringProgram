package com.FirstApp.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SysDateController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Date d=null;
		ModelAndView mav=null;
		d=new Date();
		mav=new ModelAndView("result", "Sys_Date", d);
		return mav;
	}

}
