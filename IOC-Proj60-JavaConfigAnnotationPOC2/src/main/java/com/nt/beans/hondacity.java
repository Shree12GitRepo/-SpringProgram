package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;


@Named("hondacity")
public class hondacity implements Car {
	
	@Value("Petrol and Diesel")
	private String type;
	@Value("10.3f")
	private float price;
	@Value("1497 to 1498 cc")
	private String engine;
	
	public hondacity() {
		System.out.println("hondacity.hondacity()");
	}
	
	public String getType() {
		return type;
	}
	public float getPrice() {
		return price;
	}
	public String getEngine() {
		return engine;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "hondacity [type=" + type + ", price=" + price + ", engine=" + engine + "]";
	}

}
