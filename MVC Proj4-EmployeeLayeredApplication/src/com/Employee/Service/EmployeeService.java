package com.Employee.Service;

import java.util.List;

import com.Employee.DTO.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> fetchEmployeeDetails() throws Exception;
}
