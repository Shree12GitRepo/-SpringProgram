package com.nt.Service;

import com.nt.DTO.UserDTO;

public interface LoginService {
	public String findUserNameAndPwd(UserDTO dto) throws Exception;
}
