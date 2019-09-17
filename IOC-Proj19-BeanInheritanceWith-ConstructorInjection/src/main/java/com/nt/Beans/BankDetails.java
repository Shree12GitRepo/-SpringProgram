package com.nt.Beans;

import java.util.Map;

public class BankDetails {
	
	private String bankName;
	private String bankLoc;
	private int ifsc;
	private String Loan;
	
	public BankDetails(String bankName, String bankLoc, int ifsc, String loan) {
		
		this.bankName = bankName;
		this.bankLoc = bankLoc;
		this.ifsc = ifsc;
		Loan = loan;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBankLoc(String bankLoc) {
		this.bankLoc = bankLoc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public void setLoan(String loan) {
		Loan = loan;
	}
	
	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", bankLoc=" + bankLoc + ", ifsc=" + ifsc + ", Loan=" + Loan + "]";
	}
	
	
	

}
