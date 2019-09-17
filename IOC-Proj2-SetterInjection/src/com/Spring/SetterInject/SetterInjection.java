package com.Spring.SetterInject;

import java.util.Calendar;

import com.DependentClass.Dep.DependentTest;

public class SetterInjection {
	private String Name;
	private String msg;
	private DependentTest det;
	
	/*
	 * public void setName(String Name) {
	 * System.out.println("SetterInjection.setName()"); this.Name = Name;
	 * 
	 * }
	 */
	 
	public void setDet(DependentTest det) {
		System.out.println("SetterInjection.setDet()");
		this.det = det;
	}
	 
	public SetterInjection(String Name)
	{
		//this(12,15);
		//this.msg=msg;
		this.Name=Name;
		
		System.out.println("SetterInjection.SetterInjection(String 1-Param)");
	}
	
	
	  public SetterInjection(int a, int b) { 
		  int c=a+b;
	  
	  System.out.println("SetterInjection.SetterInjection(Int 2-Param)");
	  System.out.println("The Result of C "+c); }
	 
	 
	
	public String generateWishMessage()
	{
		Calendar cal=Calendar.getInstance();
		
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
		{
			return "Good Morning "+Name+" "+msg;
		}
		else if(hour<17)
		{
			return "Good Afternoon "+Name+" "+msg;
		}
		else if(hour<21)
		{
			return "Good Evening "+Name+" "+msg;
		}
		else
		{
			return "Good Night "+Name+" "+msg;
		}
	}


	

}