package com.CP.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.CP.Command.CustomerCommand;

public class CustomerValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerValidation.supports()");
		
		return clazz.isAssignableFrom(CustomerCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("CustomerValidation.validate()");
		CustomerCommand cmd=(CustomerCommand)target;
		if(cmd.getName()==null || cmd.getName().equals("") || cmd.getName().length()==0)
		{
			errors.rejectValue("name", "com.customerName.required");
		}
		if(cmd.getAddress()==null || cmd.getAddress().equals("") || cmd.getAddress().length()==0)
		{
			errors.rejectValue("address", "com.cusomerAddress.required");
		}

	}

}
