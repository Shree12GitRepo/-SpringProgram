package com.CP.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.CP.Command.ProductDeliverCommand;

public class DeliveryProductController extends SimpleFormController {
	
	@Override
	protected void initBinder(HttpServletRequest req, ServletRequestDataBinder binder) throws Exception {
		System.out.println("------IntiBinder-----");
		SimpleDateFormat format=null;
		format=new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class,new CustomDateEditor(format, true));
		
	}
	
	
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("DeliveryProduct FormController.onSubmit()");
		//typecast the command class Object..
		ProductDeliverCommand cmd=null;
		cmd=(ProductDeliverCommand)command;
		
		return new ModelAndView(getSuccessView(),"Prodcmd",cmd);
	}
}
