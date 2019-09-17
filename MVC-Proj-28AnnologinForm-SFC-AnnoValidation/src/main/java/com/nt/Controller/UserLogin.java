package com.nt.Controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.Command.UserCommand;
import com.nt.DTO.UserDTO;
import com.nt.Service.LoginService;
import com.nt.Validation.loginValidator;

@Controller
public class UserLogin {
	
	//Inject Service...
	@Autowired
	private LoginService service;
	//Show Form Page..
	@RequestMapping(value = "/login.htm",method = RequestMethod.GET)
	public String Show_form(@ModelAttribute("cmd")UserCommand cmd) {
		System.out.println("Show form Called...");
		System.out.println("Command class Object "+cmd.hashCode());
		//Set the intial valuess...
		cmd.setUsername("Raj");
		cmd.setPwd("some pwd");
		return "login_form";
	}
	
	//Login Validation...

	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
	public String userLogin(Map<String, Object> map,@Valid@ModelAttribute("cmd") UserCommand cmd,BindingResult result) {
		System.out.println("UserLogin(-,-) called");
		System.out.println("Command class Object "+cmd.hashCode());
		UserDTO dto=null;
		String login_msg=null;
		//convert cmd to dto..
		dto=new UserDTO(); 

		System.out.println(result+"--->error");
		if(result.hasErrors()) {
			return "login_form"; 
		}
		
		BeanUtils.copyProperties(cmd, dto);
		//use service..
		try {
			
			login_msg=service.findUserNameAndPwd(dto);
			map.put("login_msg", login_msg);
		} //try
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
		return "login_form";
		
	}//method
}//class
