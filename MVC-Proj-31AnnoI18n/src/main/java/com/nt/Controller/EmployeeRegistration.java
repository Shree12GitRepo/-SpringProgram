package com.nt.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.Command.EmployeeCommand;
@Controller
public class EmployeeRegistration {
	
	@RequestMapping(value="/register.htm",method = RequestMethod.GET )
	public String ShowEmployeeForm(@ModelAttribute("cmd")EmployeeCommand cmd) {
		return "show_emp_regstrn_form";
	}

}
