package com.Employee.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.Employee.BO.EmployeeBO;
import com.Employee.DAO.EmployeeDAO;
import com.Employee.DTO.EmployeeDTO;

public class EmployeeServiceIMPL implements EmployeeService {
	private EmployeeDAO empdao;
	
	public EmployeeServiceIMPL(EmployeeDAO empdao) {
		System.out.println("EmployeeServiceIMPL::1 param");
		this.empdao=empdao;
	}

	@Override
	public List<EmployeeDTO> fetchEmployeeDetails() throws Exception {
		List<EmployeeBO> liBO=null;
		List <EmployeeDTO> liDTO=null;
		EmployeeDTO dto=null;
		
		//call from DAO class
		liBO=empdao.getEmployeeDetails();
		//copy liBO to liDTO
		for(EmployeeBO bo:liBO)
		{
			liBO=new ArrayList();
			liDTO=new ArrayList();
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			System.out.println(dto.getEmpBasicSal()+"--->");
			liDTO.add(dto);
		}
		return liDTO;
	}

}
