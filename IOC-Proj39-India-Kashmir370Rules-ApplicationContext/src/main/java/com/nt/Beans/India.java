package com.nt.Beans;

public class India {
	
	public India() {
		System.out.println("India::0-Param");
	}
	private int code;
	private float area;
	private Kashmir ksmr;
	public void setCode(int code) {
		this.code = code;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public void setKsmr(Kashmir ksmr) {
		this.ksmr = ksmr;
	}
	@Override
	public String toString() {
		return "India [code=" + code + ", area=" + area + ", ksmr=" + ksmr + "]";
	}
	
}
