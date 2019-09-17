package com.nt.Beans;

public class Dependent {
	private String name;
	private int no;
	
	public Dependent() {
		System.out.println("Dependent::0-Param");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Dependent [name=" + name + ", no=" + no + "]";
	}
	

}
