package com.AccountInformation.SBI;

public class AccountType {
	private String savingsAccount;
	private String creditAccount;
	public String getSavingsAccount() {
		return savingsAccount;
	}
	public String getCreditAccount() {
		return creditAccount;
	}
	public void setSavingsAccount(String savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}
	@Override
	public String toString() {
		return "AccountType [savingsAccount=" + savingsAccount + ", creditAccount=" + creditAccount + "]";
	}
	

}
