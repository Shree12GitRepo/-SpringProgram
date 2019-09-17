package com.nt.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.BO.SBICustomerDetailsBO;
import com.nt.DAO.SBICustomerDetailsDAO;
import com.nt.DTO.SBICustomerDetailsDTO;

@Service
public class SBICustomerDetrailsServiceimpl implements SBICustomerDetailsService {
	
	public SBICustomerDetrailsServiceimpl() {
		System.out.println("********************SBICustomerDetrailsServiceimpl***********");
	}
	
	@Autowired
	private SBICustomerDetailsDAO cusDAO;

	@Override
	public SBICustomerDetailsDTO getCustomerDetails(String accNo) {
		
		System.out.println("*********getCustomerDetails()***********");
		SBICustomerDetailsBO bo=null;
		SBICustomerDetailsDTO dto=null;
		//use DAO..
		bo=cusDAO.findcustomerDetails(accNo);
		//copy bo to dto...
		dto = new SBICustomerDetailsDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
