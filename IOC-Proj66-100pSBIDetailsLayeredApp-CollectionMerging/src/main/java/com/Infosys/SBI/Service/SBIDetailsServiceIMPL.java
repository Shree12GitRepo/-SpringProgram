package com.Infosys.SBI.Service;

import org.springframework.beans.BeanUtils;

import com.Infosys.SBI.BO.SBIDetailsBO;
import com.Infosys.SBI.DAO.SBIDetailsDAO;
import com.Infosys.SBI.DTO.SBIDetailsDTO;

public class SBIDetailsServiceIMPL implements SBIDetailsService {
	//use DAO...
	private SBIDetailsDAO dao;
	public SBIDetailsServiceIMPL(SBIDetailsDAO dao) {
		this.dao = dao;
	}

	public String registration_SBI_Info(SBIDetailsDTO dto) throws Exception {
		SBIDetailsBO bo=null;
		int result=0;
		//Bo class Object..
		bo=new SBIDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		//call insert_Query();
		result=dao.insert_Query(bo);
		//Display Registration Success or Failiure msgs..
		if(result==0)
		{
			return "Registration Failed";
		}
		else
		{
			return "Registration Succeed";
		}
		
	}

}
