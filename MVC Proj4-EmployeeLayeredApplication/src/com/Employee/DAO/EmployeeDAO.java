package com.Employee.DAO;

import java.util.List;

import com.Employee.BO.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmployeeDetails() throws Exception;
}
