package com.nt.Beans;

import java.util.Calendar;

public class Flipkart {

	private CourierDTDC dtdc;
	private Calendar cal;

	
	  public Flipkart() { System.out.println("Flipkart::0-param constructor"); }
	 
	
	public Flipkart(CourierDTDC dtdc,Calendar cal) { 
		  System.out.println("FlipKart::2-ParamReverseOrder:calender");  
		  	this.cal = cal;
		  	this.dtdc = dtdc;
	}
	
	public Flipkart(Calendar cal,CourierDTDC dtdc) { 
		  System.out.println("FlipKart::2-Param:calender");  
		  	this.cal = cal;
		  	this.dtdc = dtdc;
	}
	 
	public Flipkart(CourierDTDC dtdc) {
		System.out.println("FlipKart::1-Param:courier");	
		this.dtdc = dtdc;
	}
	public CourierDTDC getDtdc() {
		return dtdc;
	}

	public void setDtdc(CourierDTDC dtdc) {
		this.dtdc = dtdc;
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + ", cal=" + cal + "]";
	}

	
}
