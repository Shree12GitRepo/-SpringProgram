package com.nit.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.Servicess.WishMessageService;

public class WishController extends AbstractController {
	private WishMessageService wms=null;
	public WishController(WishMessageService wms) {
		this.wms=wms;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String msg=null;
		msg=wms.wishMsg();
		
		return new ModelAndView("result", "wishMsg", msg);
	}

}
