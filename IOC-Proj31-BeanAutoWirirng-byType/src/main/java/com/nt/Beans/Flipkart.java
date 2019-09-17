package com.nt.Beans;

public class Flipkart {

	private CourierDTDC dtdc;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	public CourierDTDC getDtdc() {
		return dtdc;
	}

	public void setDtdc(CourierDTDC dtdc) {
		this.dtdc = dtdc;
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + "]";
	}


}
