package com.AccountInformation.SBI;

public class CustomerOfBank {
	private String cusName;
	private AccountType acc_Type;
	private String loan;
	public CustomerOfBank(String cusName, AccountType acc_Type) {
		System.out.println("CustomerOfBank::2 Parameterized");
		this.cusName = cusName;
		this.acc_Type = acc_Type;
	}
	
	
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	
	@Override
	public String toString() {
		return "CustomerOfBank [cusName=" + cusName + ", acc_Type=" + acc_Type + ", loan=" + loan + "]";
	}
}
