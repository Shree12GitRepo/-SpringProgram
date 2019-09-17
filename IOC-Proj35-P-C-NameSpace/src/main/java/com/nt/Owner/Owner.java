package com.nt.Owner;

import java.util.Date;

import com.nt.Car.Car;

public class Owner {
	private String name;
	private String mob_no;
	private Date dob;
	private Car car;
	
	public Owner(String name, String mob_no, Date dob, Car car) {
		System.out.println("Owner.Owner(-,-,-,-)");
		this.name = name;
		this.mob_no = mob_no;
		this.dob = dob;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", mob_no=" + mob_no + ", dob=" + dob + ", car=" + car + "]";
	}

	
}
