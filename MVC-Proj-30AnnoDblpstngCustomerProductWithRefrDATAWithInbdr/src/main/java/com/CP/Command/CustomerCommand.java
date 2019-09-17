package com.CP.Command;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CustomerCommand {
	
	public CustomerCommand() {
		System.out.println("CustomerCommand::0Param");
	}
	@NotBlank(message = "Name Should not be Empty")
	private String name;
	
	@NotBlank(message = "Address Must not be Empty")
	@Size(min = 10, max = 20,message = "The Address Must be minimum 10 Charecters and Maximum 20 charecters")
	//@Max(value = 20,message = "")
	
	private String address;
	
	private String[]country= {"India"};
	
	private String[]product={"Shirt","T-Shirt"};
	
	private String gender="Male";
	
	private Date dlvrdate;
	
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
	public Date getDlvrdate() {
		return dlvrdate;
	}
	public void setDlvrdate(Date dlvrdate) {
		this.dlvrdate = dlvrdate;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "CustomerCommand [name=" + name + ", address=" + address + ", country="
				+ (country != null ? Arrays.asList(country).subList(0, Math.min(country.length, maxLen)) : null)
				+ ", product="
				+ (product != null ? Arrays.asList(product).subList(0, Math.min(product.length, maxLen)) : null)
				+ ", gender=" + gender + ", dlvrdate=" + dlvrdate + "]";
	}
	
	
}
