package com.nt.Service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service("wishMessageService")
public class WishMessageService {
	
	public WishMessageService() {
		System.out.println("WishMessageService.WishMessageService()"); 
	}
	
	public String generatewishMsg() {
		Calendar cal=null;
		cal=Calendar.getInstance();
		int hour=0;
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
		{
			return "Good Morning";
		} 
		else if(hour<17)
		{
			return "Good Afternoon";
		}
		else if(hour<20)
		{
			return "Good Evening";
		}
		else
		{
			return "Good Night";
		}
	}

}
