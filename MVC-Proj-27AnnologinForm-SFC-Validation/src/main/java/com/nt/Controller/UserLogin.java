package com.nt.Controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Inject Validator..
	@Autowired
	private loginValidator validator;
	
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
	public String userLogin(Map<String, Object> map,@ModelAttribute("cmd") UserCommand cmd,BindingResult result) {
		System.out.println("UserLogin(-,-) called");
		System.out.println("Command class Object "+cmd.hashCode());
		UserDTO dto=null;
		String login_msg=null;
		//loginValidator validator=new loginValidator();
		if(validator.supports(UserCommand.class)) {
			validator.validate(cmd, result);
			if(result.hasErrors()) {
				return "login_form";
			}
			
		}
		
			//convert cmd to dto..
			dto=new UserDTO(); 
			BeanUtils.copyProperties(cmd, dto);
			//use service..
			try {
				
				login_msg=service.findUserNameAndPwd(dto);
				System.out.println("Message===>"+login_msg);
				map.put("login_msg", login_msg);
			} //try
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
			return "login_form";
	
		
		
	}//method
}//class
