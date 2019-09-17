package com.Employee.DAO;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.EmployeeSearch.BO.EmployeeBO;
import com.EmployeeSearch.BO.EmployeeSearchResultListBO;

public class EmployeeSearchDAOIMPL implements EmployeeSearchDAO {
	private final static String get_Emp_Details="Selecct emp_no,emp_name,emp_basicSal,emp_grossSal,emp_NetSal from MVC_Employee";
	
	//JDBC Template Configuration
	private JdbcTemplate template;
	
	public EmployeeSearchDAOIMPL(JdbcTemplate template) {
		
		this.template = template;
	}
	
	@Override
	public List<EmployeeBO> serach_Employee() {
		List<EmployeeSearchResultListBO>liRBO=null;
		EmployeeBO bo=null;
		bo=new EmployeeBO();
		BeanPropertyRowMapper<EmployeeSearchResultListBO> rowmapper=null;
		//create RowMapper Object..
		rowmapper= new BeanPropertyRowMapper(EmployeeSearchResultListBO.class);
		liRBO=template.query(get_Emp_Details, RowMapperResultSetExtractor<rowmapper>,bo.getEmp_no());
		
		return null;
	}

}
