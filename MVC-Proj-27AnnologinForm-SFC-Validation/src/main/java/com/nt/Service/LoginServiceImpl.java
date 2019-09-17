package com.nt.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.BO.UserBO;
import com.nt.DAO.LoginDAO;
import com.nt.DTO.UserDTO;
@Service("loginService")
public class LoginServiceImpl implements LoginService{
	//Constructor
	@Autowired
	private LoginDAO dao;

	@Override
	public String findUserNameAndPwd(UserDTO dto) throws Exception {
		UserBO bo=null;
		int result=0;
		bo=new UserBO();
		//converrt dto to bo..
		BeanUtils.copyProperties(dto, bo);
		//use DAO...
		result=dao.getUsernameAndPWD(bo);
		if(result==0)
		{
			return "InVallied Login";
		}
		else
		{
			return "Login Success";
		}
		
	}
	

}
