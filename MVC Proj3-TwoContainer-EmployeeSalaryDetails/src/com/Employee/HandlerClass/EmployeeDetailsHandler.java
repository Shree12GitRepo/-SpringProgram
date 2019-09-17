package com.Employee.HandlerClass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Employeee.Service.EmployeeService;
import com.Employeee.Service.EmployeeServiceIMPL;

public class EmployeeDetailsHandler extends AbstractController {
	private EmployeeService eser;
	public EmployeeDetailsHandler(EmployeeService eser) {
		System.out.println("EmployeeDetailsHandler::1Param");
		this.eser=eser;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		float netsal=0.0f;
		float grossssal=0.0f;
		
		netsal=eser.netSalary();
		grossssal=eser.grossSalary();
		
		return new mo
	}

}
