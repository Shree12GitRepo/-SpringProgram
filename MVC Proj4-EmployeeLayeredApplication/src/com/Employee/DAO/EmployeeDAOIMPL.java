package com.Employee.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.Employee.BO.EmployeeBO;

public class EmployeeDAOIMPL implements EmployeeDAO {
	List<EmployeeBO> liBO=null;
	JdbcTemplate template=null;
	private String get_Employee_Details="SELECT EMP_NO,EMP_NAME,EMP_BASICSAL,EMP_GROSSSAL,EMP_NETSAL from MVC_Employee";
	public EmployeeDAOIMPL(JdbcTemplate template) {
		System.out.println("EmployeeDAOIMPL::1 param");
		this.template=template;
	}
	@Override
	public List<EmployeeBO> getEmployeeDetails() throws Exception {
		liBO=new ArrayList();
		liBO=(List<EmployeeBO>) template.query(get_Employee_Details, new EmployeeExtractor());
		return liBO;
	}
	private class EmployeeExtractor implements ResultSetExtractor <List<EmployeeBO>>{
		
	
		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			liBO =new ArrayList();
			EmployeeBO bo=null;
			while(rs.next())
			{
				bo=new EmployeeBO();
				bo.setEmployeeNo(rs.getInt(1));
				bo.setEmployeeName(rs.getString(2));
				bo.setEmpBasicSal(rs.getFloat(3));
				bo.setEmpgrossSal(rs.getFloat(4));
				bo.setEmpNetSal(rs.getFloat(5));
				liBO.add(bo);
			}
			
			return  liBO;
		}
		
	}

}
