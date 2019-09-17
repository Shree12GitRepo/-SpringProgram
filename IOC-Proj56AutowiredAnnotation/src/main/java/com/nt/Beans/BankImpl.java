package com.nt.Beans;

public class BankImpl implements Bank {
	private String bankName;
	private String bankAddrs;
	
	public BankImpl() {
		System.out.println("BankImpl.BankImpl()");
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBankAddrs(String bankAddrs) {
		this.bankAddrs = bankAddrs;
	}

	@Override
	public String toString() {
		return "BankImpl [bankName=" + bankName + ", bankAddrs=" + bankAddrs + "]";
	}

	
}
