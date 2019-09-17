package com.nt.scientist.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.scientist.Servicess.ScientistDetailsService;

public class ScientistReportContorller extends AbstractController{
	private ScientistDetailsService service;

	public ScientistReportContorller(ScientistDetailsService service) {
		System.out.println("ScientistReportContorller::1Param");
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List liDTO=service.fetchScientistDetails();
		
		return new ModelAndView("report", "liDTO", liDTO);
	}

	

}
