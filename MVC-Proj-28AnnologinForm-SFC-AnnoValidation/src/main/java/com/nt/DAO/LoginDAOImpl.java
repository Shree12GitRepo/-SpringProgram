package com.nt.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.BO.UserBO;
@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private final static String login_Query="SELECT count(*) FROM LOGIN WHERE USERNAME=? AND PASSWORD=?";
	
	//Constructor
	@Autowired
	
	private JdbcTemplate jt;
	
	@Override
	public int getUsernameAndPWD(UserBO bo) throws Exception {
		//use jt
		int result=0;
		result=jt.queryForObject(login_Query, Integer.class,bo.getUsername(),bo.getPwd());		
		System.out.println(result);
		return result;
	}
}

