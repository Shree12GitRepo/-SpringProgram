package com.Beans.Shopping;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private BlueDartCourrier bdrtr;
	static {
		System.out.println("Flipkart.enclosing_method()");
	}
	
	  public Flipkart() { 
		  System.out.println("Flipkart.Flipkart()"); 
		 }
	 

	//Setter Injection help Of setterMethod
	/*
	 * public void setBdrtr(BlueDartCourrier bdrtr) { this.bdrtr = bdrtr; }
	 */

	public Flipkart(BlueDartCourrier bdrtr) {
		System.out.println("Flipkart.Flipkart(Bluedart Object Constructor)");
		
		this.bdrtr = bdrtr;
	}
	
	public String Shopping(String items[], float prices[])
	{
		float bill=0.0f;
		
		//calculate shopping Bill..
		for(float price:prices)
		{
			bill=bill+price;
		}
		//generate OrderID..
		int orderID=new Random().nextInt(80000);
		//ready to deliver the products..
		String deliver=bdrtr.deliver(orderID);
		return "Shooping items "+Arrays.toString(items)+" and Price "+Arrays.toString(prices)+" for "+orderID +" Whose total bill is "+bill;
	}

	

}
