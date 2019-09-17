package com.CP.Command;

import java.util.Arrays;

public class CustomerCommand {
	
	public CustomerCommand() {
		System.out.println("CustomerCommand::0Param");
	}
	
	private String name;
	private String address;
	private String[]country= {"India"};
	private String[]product={"Shirt","T-Shirt"};
	private String gender="Male";
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String[] getCountry() {
		return country;
	}
	public String[] getProduct() {
		return product;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCountry(String[] country) {
		this.country = country;
	}
	public void setProduct(String[] product) {
		this.product = product;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "CustomerCommand [name=" + name + ", address=" + address + ", country="
				+ (country != null ? Arrays.asList(country).subList(0, Math.min(country.length, maxLen)) : null)
				+ ", product="
				+ (product != null ? Arrays.asList(product).subList(0, Math.min(product.length, maxLen)) : null)
				+ ", gender=" + gender + "]";
	}
}
