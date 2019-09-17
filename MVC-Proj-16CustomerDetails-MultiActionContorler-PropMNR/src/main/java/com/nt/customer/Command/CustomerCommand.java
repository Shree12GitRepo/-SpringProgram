package com.nt.customer.Command;

public class CustomerCommand {
	private String cname;
	private String cadd;
	private long cmob;
	
	public CustomerCommand() {
		System.out.println("CustomerCommand::0Param");
	}
	
	public String getCname() {
		return cname;
	}
	public String getCadd() {
		return cadd;
	}
	public long getCmob() {
		return cmob;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public void setCmob(long cmob) {
		this.cmob = cmob;
	}
	
	@Override
	public String toString() {
		return "CustomerCommand [cname=" + cname + ", cadd=" + cadd + ", cmob=" + cmob + "]";
	}
	
}
