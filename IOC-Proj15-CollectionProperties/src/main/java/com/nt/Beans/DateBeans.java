package com.nt.Beans;

import java.util.Date;

public class DateBeans {
	private Date dt;

	public DateBeans(Date dt) {
		
		this.dt = dt;
	}
	
	@Override
	public String toString() {
		return "DateBeans [dt=" + dt + "]";
	}
}
