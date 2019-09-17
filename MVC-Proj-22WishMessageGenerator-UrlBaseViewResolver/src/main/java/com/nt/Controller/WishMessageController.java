package com.nt.Controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Calendar cal=null;
		cal=Calendar.getInstance();
		int hour=0;
		hour=cal.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12)
		{
			msg="Good Morning";
		}
		else if(hour<17)
		{
			msg="Good Afternoon";
		}
		else if(hour<21)
		{
			msg="Good Eveneing";
		}
		else
		{
			msg="Good Night";
		}
		return new ModelAndView("wishmessage", "wishmsg", msg);
	}

}
