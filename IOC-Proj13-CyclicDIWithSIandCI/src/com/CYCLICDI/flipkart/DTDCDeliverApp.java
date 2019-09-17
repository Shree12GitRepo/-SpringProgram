package com.CYCLICDI.flipkart;

public class DTDCDeliverApp {
	
	private FlipkartShoppingApp fkrt;
	
	//constructor 
	public DTDCDeliverApp(FlipkartShoppingApp fkrt) {
		System.out.println("DTDCDeliverApp::ConstructorInjection");
		this.fkrt = fkrt;
	}

	/*
	 * public void setFkrt(FlipkartShoppingApp fkrt) {
	 * System.out.println("DTDCDeliverApp::SetterInjection"); this.fkrt = fkrt; }
	 */

}
