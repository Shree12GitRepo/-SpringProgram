package com.nt.beans;

import java.util.Calendar;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Named("wmg")
@Component("wmg")
public class WishmesageGenerator {
	
	public WishmesageGenerator() {
		System.out.println("WishmesageGenerator.WishmesageGenerator()");
	}
	
	@Autowired
	private Calendar cal;
	@Autowired
	private WeatherReport report;
	
	public String getWishMessage() {
		int hour=0;
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			return "Good Morning";
		}
		if(hour<17) {
			return "Good Afternoon";
		}
		
		if(hour<20) {
			return "Good Evening";
		}
		else {
			return "Good Night";
		}
	}

	@Override
	public String toString() {
		return "WishmesageGenerator [cal=" + cal + ", report=" + report + "]";
	}
}
