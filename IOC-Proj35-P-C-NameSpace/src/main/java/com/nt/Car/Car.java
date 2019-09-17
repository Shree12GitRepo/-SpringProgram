package com.nt.Car;

import java.util.Date;

public class Car {
	private String name;
	private String model;
	private Date dop;
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", dop=" + dop + "]";
	}

}
