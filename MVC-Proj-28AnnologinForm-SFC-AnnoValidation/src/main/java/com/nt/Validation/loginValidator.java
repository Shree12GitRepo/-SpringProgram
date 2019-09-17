package com.nt.Validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.Command.UserCommand;

@Component
public class loginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("Supports Called");
		
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("Login Validator called");
		//typecast command class..
		UserCommand cmd=(UserCommand)target;
		
		//validation logics...
		
		if(cmd.getUsername()==null || cmd.getUsername()=="")
			errors.rejectValue("username","com.nt.Command.Username");
		if(cmd.getPwd()==null || cmd.getPwd()=="")
			errors.rejectValue("pwd", "com.nt.Command.Password");
		
	}

}
