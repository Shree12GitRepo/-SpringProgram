package com.CYCLICDI.flipkart;

public class DTDCDeliverApp {
	
	private FlipkartShoppingApp fkrt;

	public DTDCDeliverApp(FlipkartShoppingApp fkrt) {
		System.out.println("DTDCDeliverApp::ConstructorInjection");
		this.fkrt = fkrt;
	}

	

}
