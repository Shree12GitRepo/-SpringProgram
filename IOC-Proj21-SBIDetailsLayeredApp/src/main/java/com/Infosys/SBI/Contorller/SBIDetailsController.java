package com.Infosys.SBI.Contorller;

import org.springframework.beans.BeanUtils;

import com.Infosys.SBI.DTO.SBIDetailsDTO;
import com.Infosys.SBI.Service.SBIDetailsService;
import com.Infosys.SBI.VO.SBIDetailsVO;

public class SBIDetailsController {
	//use Service ..
	private SBIDetailsService service;

	public SBIDetailsController(SBIDetailsService service) {
		this.service = service;
		System.out.println("SBIDetailsController::1Param");
	}
	public void registartion_SBIDetails(SBIDetailsVO vo)
	{
		SBIDetailsDTO dto=null;
		dto=new SBIDetailsDTO();
		//convert VO To DTO..
		BeanUtils.copyProperties(vo, dto);
		try {
			System.out.println(dto.getAccountant_Name());
			String msg=service.registration_SBI_Info(dto);
			System.out.println(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
