package com.nt.Service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service
public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateWishMessage() {
		System.out.println("************generateWishMessage()****************");
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		//Write the Wish msg logic..
		if(hour<12) {
			return "Good Morning";
		}
		
		else if(hour<17) {
			return "Good Afternooon";
		}
		
		else if(hour<20) {
			return "Good Evening";
		}
		else {
			return "Good Night";
		}
		
	}

}
