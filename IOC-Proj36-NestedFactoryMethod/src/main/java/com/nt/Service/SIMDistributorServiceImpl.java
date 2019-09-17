package com.nt.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.BO.SIMDistributorBO;
import com.nt.DAO.SIMDistributorDAO;
import com.nt.DTO.SIMDistributorDTO;

public class SIMDistributorServiceImpl implements SIMDistributorService{
	private SIMDistributorDAO dao;

	public SIMDistributorServiceImpl(SIMDistributorDAO dao) {
		System.out.println("SIMDistributorServiceImpl::1ParamConstructor");
		this.dao = dao;
	}

	@Override
	public List<SIMDistributorDTO> get_Distributor_detail_BySIMName(String[] simName) throws Exception {
		List<SIMDistributorBO> liBO=null;
		StringBuffer  sb=null;
		SIMDistributorDTO dto=null;
		List<SIMDistributorDTO> liDTO=null;
		//use StringBuffer for creating one Object use for dao..
			sb=new StringBuffer("(");
			for(int i=0;i<simName.length;++i)
			{
				if(i==simName.length-1)
				{
					sb.append("'"+simName[i]+"'");
				}
				else
				{
					sb.append("'"+simName[i]+"',");
				}
			}
			sb.append(")");
		//use dao..
			
		liBO=dao.find_Distributor_NameBySIM_Name(sb.toString());
		
		liDTO=new ArrayList<SIMDistributorDTO>();
		//convert bo to dto
		
		  for(SIMDistributorBO bo:liBO) { 
			  
			  
			  dto=new SIMDistributorDTO();
			  BeanUtils.copyProperties(bo, dto);
			  liDTO.add(dto);
		  }
		
		return liDTO;
	}

	

}
