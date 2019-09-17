package com.nt.Command;

public class SBICustomerDetailsCommand {
	
	
	public SBICustomerDetailsCommand() {
		System.out.println("************SBICustomerDetailsDTO**************");
	}
	
	private String accountnumber;
	private String name;
	private String acctType;
	private float balance;
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public String getAcctType() {
		return acctType;
	}

	public float getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}
