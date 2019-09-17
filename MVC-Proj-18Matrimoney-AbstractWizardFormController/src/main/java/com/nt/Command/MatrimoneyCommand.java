package com.nt.Command;

import java.util.Arrays;
import java.util.Date;

public class MatrimoneyCommand {
	private String name;
	private String addr;
	private String gender="Male";
	private Date dob;
	private String Desg;
	private String qlfctn="MCA";
	private float salary;
	private String expDesg;
	private String expAge;
	private String[] hobbies;
	
	public MatrimoneyCommand() {
		System.out.println("MatrimoneyCommand::0-param");
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getGender() {
		return gender;
	}
	public Date getDob() {
		return dob;
	}
	public String getDesg() {
		return Desg;
	}
	public String getQlfctn() {
		return qlfctn;
	}
	public float getSalary() {
		return salary;
	}
	public String getExpDesg() {
		return expDesg;
	}
	public String getExpAge() {
		return expAge;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDesg(String desg) {
		Desg = desg;
	}
	public void setQlfctn(String qlfctn) {
		this.qlfctn = qlfctn;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setExpDesg(String expDesg) {
		this.expDesg = expDesg;
	}
	public void setExpAge(String expAge) {
		this.expAge = expAge;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "MatrimoneyCommand [name=" + name + ", addr=" + addr + ", gender=" + gender + ", dob=" + dob + ", Desg="
				+ Desg + ", qlfctn=" + qlfctn + ", salary=" + salary + ", expDesg=" + expDesg + ", expAge=" + expAge
				+ ", hobbies="
				+ (hobbies != null ? Arrays.asList(hobbies).subList(0, Math.min(hobbies.length, maxLen)) : null) + "]";
	}

}
