package com.nt.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bk1")
public class BankImpl implements Bank {
	@Value("SBI")
	private String bankName;
	@Value("Kakatpur")
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
