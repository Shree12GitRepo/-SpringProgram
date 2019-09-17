package com.nt.Command;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class InsertHotelDetailsCommand {
	private String name;
	private String state;
	private String city;
	private String couplefrndly;
	private String type;
	
	public InsertHotelDetailsCommand() {
		System.out.println("InsertHotelDetailcommand::0-Param");
	}
	
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getCouplefrndly() {
		return couplefrndly;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCouplefrndly(String couplefrndly) {
		this.couplefrndly = couplefrndly;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "InsertHotelDetailBO [name=" + name + ", state=" + state + ", city=" + city + ", couplefrndly="
				+ couplefrndly + ", type=" + type + "]";
	}
}
