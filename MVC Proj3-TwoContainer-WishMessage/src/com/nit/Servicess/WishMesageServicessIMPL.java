package com.nit.Servicess;

import java.util.Calendar;

public class WishMesageServicessIMPL implements WishMessageService {

	@Override
	public String wishMsg() {
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
		{
			return "Good Morning";
		}
		else if(hour<17)
		{
			return "Good Afternoon";
		}
		else if(hour<21)
		{
			return "Good Evening";
		}
		else
		{
			return "Good Night";
		}
	}
	
}
