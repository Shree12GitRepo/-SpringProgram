package com.nt.Beans;

import java.util.Map;

public class MonthDays {
	private Map MonthAndDays;

	public void setMonthAndDays(Map monthAndDays) {
		MonthAndDays = monthAndDays;
	}

	@Override
	public String toString() {
		return "MonthDays [MonthAndDays=" + MonthAndDays + "]";
	}

}
