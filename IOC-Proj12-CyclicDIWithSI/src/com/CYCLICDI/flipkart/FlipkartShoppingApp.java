package com.CYCLICDI.flipkart;

public class FlipkartShoppingApp {
	private DTDCDeliverApp dtdc;

	public void setDtdc(DTDCDeliverApp dtdc) {
		System.out.println("FlipkartShoppingApp::SetterInjection");
		this.dtdc = dtdc;
	}
	
	
}
