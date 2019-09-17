package com.nt.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.DTO.SIMDistributorDTO;

public class SIMDistributorControler extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<SIMDistributorDTO> liDTO=null;
		SIMDistributorDTO dto,dto2,dto3=null;
		liDTO=new ArrayList<SIMDistributorDTO>();
		//1st DTO added...
		dto=new SIMDistributorDTO();
		dto.setId(101);
		dto.setDname("RaghuNath Sahoo");
		dto.setLocation("Kaktpur");
		dto.setSimCompany("IDEA");
		liDTO.add(dto);
		
		//second DTO
		dto2=new SIMDistributorDTO();
		dto2.setId(102);
		dto2.setDname("SaiKrupa Nayak");
		dto2.setLocation("Kaktpur");
		dto2.setSimCompany("AIRTEL");
		liDTO.add(dto2);	
		//second DTO
		dto3=new SIMDistributorDTO();
		dto3.setId(103);
		dto3.setDname("Rajiv Shau");
		dto3.setLocation("Puri");
		dto3.setSimCompany("JIO");
		liDTO.add(dto3);	
		//write PDF view logics..
		if(req.getParameter("type").equalsIgnoreCase("PDF"))
		{
			//return PDF mav Object..
			return new ModelAndView("drpdf", "drliDTOPDF", liDTO);
		}
		else
		{
			//return Excel Mav Object..
			return new ModelAndView("drxcel", "drliDTOxcel", liDTO);
		}
		
	}

}
