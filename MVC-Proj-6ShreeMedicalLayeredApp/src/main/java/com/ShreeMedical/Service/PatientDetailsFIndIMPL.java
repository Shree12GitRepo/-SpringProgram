package com.ShreeMedical.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ShreeMedical.BO.PatientDetailsBO;
import com.ShreeMedical.BO.PatientDetailsResultListBO;
import com.ShreeMedical.DAO.patientDetailsDAO;
import com.ShreeMedical.DTO.PatientDetailsDTO;
import com.ShreeMedical.DTO.PatientDetailsResultDTO;

public class PatientDetailsFIndIMPL implements PatientDetailsFind {
	PatientDetailsBO bo=null;
	private patientDetailsDAO dao;
	

	public PatientDetailsFIndIMPL(patientDetailsDAO dao) {
		System.out.println("PatientDetailsFIndIMPL::DAO ConstructorInjection");
		this.dao = dao;
	}


	@Override
	public List<PatientDetailsResultDTO> findPatientDetails(PatientDetailsDTO dto) {
		
		/*Passing Data DTO to BO*/
		
			
			bo=new PatientDetailsBO();
			//convert DTO to BO..
			BeanUtils.copyProperties(dto, bo);
			System.out.println("BO Data Passed with Value "+bo.getPname());
			
		/*Passing Data DTO to BO*/
			
		/*Passing Data From liBO to liDTO*/
			List<PatientDetailsResultListBO> liBO=null;
			List<PatientDetailsResultDTO>    liDTO=null;
			PatientDetailsResultDTO pdto= null;
			//crete the liDTO Object..
			liDTO=new ArrayList();
			liBO=dao.searchPatient(bo);
			System.out.println("service listbo ::  "+liBO);
			//System.out.println("Data Comming From DAO TO Service "+liBO.get(0));
			for(PatientDetailsResultListBO libo:liBO)
			{
				pdto = new PatientDetailsResultDTO();
				
				BeanUtils.copyProperties(libo, pdto);
				liDTO.add(pdto);
			}
					
		/*Passing Data From liBO to liDTO*/
		return liDTO;
	}
	
	
}
