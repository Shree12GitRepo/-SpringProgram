package com.DynamicObject.Reflection;

public class WishMessage {
	private String Name;
	
	//parameterized Constructor..
	private WishMessage(String Name) {
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	

}
