package com.CP.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.CP.Command.CustomerCommand;

public class CustomerFormController extends SimpleFormController {
	@Override
	protected Map referenceData(HttpServletRequest req) throws Exception {
		System.out.println("CustomerFormController::ReferenceData");
		Map<String, List> custmap=new HashMap<String, List>();
		List country=new ArrayList();
		country.add("India");country.add("Pakistan");country.add("UAE");country.add("Japan");
		country.add("Germany");
		List product=new ArrayList();
		product.add("Shirt");product.add("T-Shirt");product.add("Leggins");product.add("Kurti");product.add("lehenga");
		product.add("Washing Machine");
		List gender=new ArrayList();
		gender.add("Male");
		gender.add("Female");
		
		custmap.put("countryList", country);
		custmap.put("productList",product);
		custmap.put("genderList",gender);
		
		return custmap;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("CustomerFormController.onSubmit()");
		//typecast the command class Object..
		CustomerCommand cmd=null;
		cmd=(CustomerCommand)command;
		
		return new ModelAndView(getSuccessView(),"Custcmd",cmd);
	}
}
