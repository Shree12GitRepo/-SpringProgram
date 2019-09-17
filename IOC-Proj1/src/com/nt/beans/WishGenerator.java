package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	
	  public void setDate(Date date) {
		  this.date = date; }
	 
	private Date date;
	
	
	  public WishGenerator() {
		  System.out.println("WishGenerator.WishGenerator()");
	  }
	 
	//generate Wish Messages...
	public String generatorWishMessage(String name)
	{
		int hour=date.getHours();
		if(hour<12)
		{
			return "Good Morning "+name;
		}
		else if(hour<17)
		{
			return "Good Afternoon "+name;
		}
		else if(hour<21)
		{
			return "Good Evening "+name;
		}
		else
		{
			return "Good Night "+name;
		}
	}
}
