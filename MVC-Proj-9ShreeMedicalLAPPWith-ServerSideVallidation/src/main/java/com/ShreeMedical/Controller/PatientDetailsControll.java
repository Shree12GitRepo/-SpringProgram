package com.ShreeMedical.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.ShreeMedical.Command.PatientDetailsCommand;
import com.ShreeMedical.DTO.PatientDetailsDTO;
import com.ShreeMedical.Service.PatientDetailsService;

public class PatientDetailsControll extends SimpleFormController {
	//use service
	private PatientDetailsService service;

	public PatientDetailsControll(PatientDetailsService service) {
		System.out.println("PatientDetailsControll::From Controller");
		this.service = service;
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		String regMsg=null;
		//Typecast command Object to Command class..
		PatientDetailsCommand cmd=(PatientDetailsCommand) command;
		//use DTO class..
		PatientDetailsDTO dto=null;
		dto=new PatientDetailsDTO();
		//convert cmd to DTO..
		BeanUtils.copyProperties(cmd, dto);
		//use Service
		regMsg=service.registerPatientDetails(dto);
		System.out.println(regMsg);
		return new ModelAndView(this.getSuccessView(), "resMsg", regMsg);
	}
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		return new ModelAndView("dbl_post");
		
	}

}
