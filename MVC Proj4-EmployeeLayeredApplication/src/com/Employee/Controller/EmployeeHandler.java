package com.Employee.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Employee.DTO.EmployeeDTO;
import com.Employee.Service.EmployeeService;

public class EmployeeHandler extends AbstractController {
	private EmployeeService empServc;
	public EmployeeHandler( EmployeeService empServc) {
		System.out.println("EmployeeHandler::1Param");
		this.empServc=empServc;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<EmployeeDTO> liDTO=null;
		ModelAndView mav=null;
	
		liDTO=empServc.fetchEmployeeDetails();
		System.out.println(liDTO);
		
		mav=new ModelAndView("emp_details", "employee_Details", liDTO);
		return mav;
	}

}
