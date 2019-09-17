package com.ShreeMedical.Vallidation;

import java.text.SimpleDateFormat;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ShreeMedical.Command.PatientDetailsCommand;

public class FormValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(PatientDetailsCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Cast target to Command class
		PatientDetailsCommand cmd=(PatientDetailsCommand) target;
		//Write Validation Logics...
		if(cmd.getPname().length()==0 || cmd.getPname()==null || cmd.getPname()=="")
		{
			errors.rejectValue("pname","com.PatientDetails.Vallidator.pname");
		}
		
		if(cmd.getPadd().length()==0 || cmd.getPadd()==null || cmd.getPname()=="")
		{
			errors.rejectValue("padd","com.PatientDetails.Vallidator.padd" );
		}
		else if(cmd.getPadd().length()<0 || cmd.getPadd().length()>10)
		{
			errors.rejectValue("padd", "com.PatientDetails.Vallidator.required");
		}
		if(cmd.getDisease().length()==0 || cmd.getDisease()==null)
		{
			errors.rejectValue("disease","com.PatientDetails.Vallidator.disease");
		}
		if(cmd.getDoctors().length()==0 || cmd.getDoctors()==null)
		{
			errors.rejectValue("doctors","com.PatientDetails.Vallidator.doctors");
		}
		
		if(cmd.getRegeistrationdate()==null)
		{
			errors.rejectValue("regeistrationdate","com.PatientDetails.Vallidator.regeistrationdate");
		}
		
		
	}

}
