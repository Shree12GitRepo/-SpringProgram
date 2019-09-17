package com.FrontController.Handlerclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {
	public String handle(HttpServletRequest req,HttpServletResponse res) throws Exception;

}
