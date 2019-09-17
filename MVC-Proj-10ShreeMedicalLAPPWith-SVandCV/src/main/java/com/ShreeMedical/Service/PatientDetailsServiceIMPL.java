package com.ShreeMedical.Service;

import org.springframework.beans.BeanUtils;

import com.ShreeMedical.BO.PatientDetailsBO;
import com.ShreeMedical.DAO.PatientDetailsDAO;
import com.ShreeMedical.DTO.PatientDetailsDTO;

public class PatientDetailsServiceIMPL implements PatientDetailsService{
	//use DAO
	private  PatientDetailsDAO dao;
	
	public PatientDetailsServiceIMPL(PatientDetailsDAO dao) {
	
		this.dao = dao;
	}

	@Override
	public String registerPatientDetails(PatientDetailsDTO dto) {
		int regCount=0;
		//create BO class Object..
		PatientDetailsBO bo=null;
		bo=new PatientDetailsBO();
		//convert dto to BO
		BeanUtils.copyProperties(dto, bo);
		
		regCount=dao.insertPatientDetails(bo);
		
		//generate Registration Message..
		if(regCount==0)
		{
			return "Registration Failed";
		}
		
		else {
			return "Registration Successed";
		}
	}

	

}
