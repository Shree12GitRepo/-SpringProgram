package com.nt.Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.Command.MatrimoneyCommand;

public class MatrimoneyRegistration extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("-----MatrimoneyRegistration.processFinish()----");
		MatrimoneyCommand cmd=(MatrimoneyCommand)command;
		
		return new ModelAndView("result", "mrgDetails", cmd);
	}
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		System.out.println("MatrimoneyRegistration.processCancel()");
		return new ModelAndView("welcome");
	}
	
	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		System.out.println("-------MatrimoneyRegistration.initBinder()------");
		SimpleDateFormat format=null;
		format=new SimpleDateFormat("dd-MM-yyyy");
		
		//register Custom PropertyEditor.
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
		
	}
	
	@Override
	public Map referenceData(HttpServletRequest req, Object cmd, Errors ers, int page) throws Exception {
		System.out.println("MatrimoneyRegistration.referenceData()");
		MatrimoneyCommand mcmd=(MatrimoneyCommand)cmd;
		Map<String, List<String>> map=null;
		map=new HashMap<String, List<String>>();
		//List for Gender...
		List<String> gender=new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		
		//List for Qualification..
		List<String> qlfn=new  ArrayList<String>();
		qlfn.add("BTech");
		qlfn.add("BSC");
		qlfn.add("M.Sc");
		qlfn.add("MCA");
		
		//List for hobbies..
		List<String> hobbies=new ArrayList<String>();
		hobbies.add("Acting");
		hobbies.add("Sleeping");
		hobbies.add("Teaching");
		hobbies.add("Cook");
		
		//Add the Lists into Map..
		map.put("genderList", gender);
		map.put("hobbiesList", hobbies);
		map.put("Qualification", qlfn);
		
		return map;
	}
	
	

}
