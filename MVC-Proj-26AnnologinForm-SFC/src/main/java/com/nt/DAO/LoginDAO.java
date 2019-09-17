package com.nt.DAO;

import com.nt.BO.UserBO;

public interface LoginDAO {
	
	public int getUsernameAndPWD(UserBO bo) throws Exception;

}
