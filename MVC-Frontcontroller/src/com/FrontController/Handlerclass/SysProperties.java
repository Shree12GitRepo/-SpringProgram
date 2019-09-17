package com.FrontController.Handlerclass;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysProperties implements Handler {
	
	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//generate System Properties...
		Properties prop=System.getProperties();
		req.setAttribute("Sys_prop", prop);
		return "sysproperties";
	}

}
