package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ford")
public class Ford implements Car {
	
	public Ford() {
		System.out.println("Ford.Ford()");
	}
	@Value("${ford.type}")
	private String type;
	@Value("${ford.price}")
	private float price;
	@Value("${ford.engine}")
	private String engine;
	
	
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
		return "Ford [type=" + type + ", price=" + price + ", engine=" + engine + "]";
	}
}
