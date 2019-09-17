package com.nt.DAO;

import java.util.List;

import com.nt.BO.SIMDistributorBO;

public interface SIMDistributorDAO {
	
	public List<SIMDistributorBO> find_Distributor_NameBySIM_Name(String simName) throws Exception;

}
