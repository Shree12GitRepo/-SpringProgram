package com.nt.Controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.DTO.SIMDistributorDTO;
import com.nt.Service.SIMDistributorService;

public class SIMDistributorController {
	
	private SIMDistributorService disService;

	public SIMDistributorController(SIMDistributorService disService) {
		System.out.println("SIMDistributorController::1Param");
		this.disService = disService;
	}
	
	public List<SIMDistributorDTO> getDistributorDetails(String simName[]) throws Exception
	{
		List<SIMDistributorDTO> liDTO=null;
		liDTO=new  ArrayList<SIMDistributorDTO>();
		try {
			liDTO=disService.get_Distributor_detail_BySIMName(simName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return liDTO;
	}

}
