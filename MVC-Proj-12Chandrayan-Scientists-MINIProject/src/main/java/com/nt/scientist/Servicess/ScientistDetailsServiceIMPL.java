package com.nt.scientist.Servicess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.scientist.BO.ScientistBO;
import com.nt.scientist.DAO.ScientistsDetailsDAO;
import com.nt.scientist.DTO.ScientistDTO;

public class ScientistDetailsServiceIMPL implements ScientistDetailsService {
	//inject DAO class..
	private ScientistsDetailsDAO dao;

	public ScientistDetailsServiceIMPL(ScientistsDetailsDAO dao) {
		System.out.println("ScientistDetailsServiceIMPL::1Param");
		this.dao = dao;
	}

	@Override
	public List<ScientistDTO> fetchScientistDetails() {
		//call getScientistDetail()...
		List<ScientistBO> liBO=null;
		List<ScientistDTO> liDTO=null;
		
		liBO=dao.getScientistDetails();
		
		liDTO=new ArrayList<ScientistDTO>();
		
		//convert liBO to liDTO...
		for(ScientistBO bo:liBO)
		{
			ScientistDTO dto=new ScientistDTO();
			//copy BO to DTO..
			BeanUtils.copyProperties(bo, dto);
			//add the dto to liDTO..
			liDTO.add(dto);
		}
		
		return liDTO;
	}

	@Override
	public ScientistDTO fetchScientistDetailsById(int id) {
		ScientistDTO dto=null;
		ScientistBO bo=null;
		//convert bo to dto
		bo=dao.getScientistDetailsById(id);
		dto=new ScientistDTO();
		BeanUtils.copyProperties(bo, dto);
		System.out.println("SCDTO----->"+dto.getDomainName());
		return dto;
	}

	@Override
	public String updateScientistDetails(ScientistDTO dto) {
		//call DAO Update Method..
		int daoupdt=0;
		ScientistBO bo=null;
		bo=new ScientistBO();
		//copy dto to bo
		BeanUtils.copyProperties(dto, bo);
		daoupdt=dao.getScientistUpdate(bo);
		if(daoupdt==0)
		{
			return "........Updation Failed....";
		}
		else {
			return "Updation Success..";
		}
	}

	@Override
	public String removeScientistDetails(ScientistDTO dto) {
		ScientistBO bo=null;
		bo=new ScientistBO();
		int rmovesc=0;
		//convert dto to Bo..
		
		BeanUtils.copyProperties(dto, bo);
		rmovesc=dao.getScientistDeletion(bo);
		if(rmovesc==0)
		{
			return "......Deletion Successfull....";
		}
		else {
			return "......Failed to Delete Records.....";
		}
		
	}

}
