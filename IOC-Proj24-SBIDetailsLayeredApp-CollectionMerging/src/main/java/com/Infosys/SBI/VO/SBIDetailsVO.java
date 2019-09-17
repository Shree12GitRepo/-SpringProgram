package com.Infosys.SBI.VO;

import java.util.Date;
//import java.sql.Date;
public class SBIDetailsVO {
	private int id;
	private String branch_name;
	private String bank_Mgr_Name;
	private String branch_Mgr_Name;
	private String accountant_Name;
	private String security_Guard_Name;
	private int ifsc_code;
	private Date doj;
	
	//Constructor...
	public SBIDetailsVO() {
		System.out.println("Vo-Class Intialisation");
	}
	public int getId() {
		return id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public String getBank_Mgr_Name() {
		return bank_Mgr_Name;
	}
	public String getBranch_Mgr_Name() {
		return branch_Mgr_Name;
	}
	public String getAccountant_Name() {
		return accountant_Name;
	}
	public String getSecurity_Guard_Name() {
		return security_Guard_Name;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public Date getDoj() {
		return doj;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public void setBank_Mgr_Name(String bank_Mgr_Name) {
		this.bank_Mgr_Name = bank_Mgr_Name;
	}
	public void setBranch_Mgr_Name(String branch_Mgr_Name) {
		this.branch_Mgr_Name = branch_Mgr_Name;
	}
	public void setAccountant_Name(String accountant_Name) {
		this.accountant_Name = accountant_Name;
	}
	public void setSecurity_Guard_Name(String security_Guard_Name) {
		this.security_Guard_Name = security_Guard_Name;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	

}
