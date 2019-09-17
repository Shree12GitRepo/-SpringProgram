package com.nt.DAO;

import java.util.List;

import com.nt.BO.SBICustomerDetailsBO;

public interface SBICustomerDetailsDAO {
	
	public SBICustomerDetailsBO findcustomerDetails(String accountNumber);

}
