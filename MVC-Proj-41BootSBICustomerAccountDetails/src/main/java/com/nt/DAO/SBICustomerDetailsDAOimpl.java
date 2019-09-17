package com.nt.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.BO.SBICustomerDetailsBO;

@Repository
public class SBICustomerDetailsDAOimpl implements SBICustomerDetailsDAO{
	@Autowired
	private JdbcTemplate jt;
	
	//Database Query...
	private static String customer_details="SELECT accountnumber as ACCOUNTNUMBER,NAME,ACCOUNTTYPE,BALANCE FROM SBICUSTOMERDETAILS WHERE ACCOUNTNUMBER=?";

	@Override
	public SBICustomerDetailsBO findcustomerDetails(String accountNumber) {
		System.out.println("**********findcustomerDetails()************");
		
		SBICustomerDetailsBO bo=null;
	
		//execute Query..
		bo=new SBICustomerDetailsBO();
		//invoke Query()...
		bo=jt.queryForObject(customer_details, new BeanPropertyRowMapper<SBICustomerDetailsBO>(SBICustomerDetailsBO.class), accountNumber);
		return bo;
	}
	
	
}
