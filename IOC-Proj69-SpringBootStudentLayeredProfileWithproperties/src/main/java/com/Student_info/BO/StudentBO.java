package com.Student_info.BO;

public class StudentBO {
	private String Name;
	private int Roll;
	private String Address;
	private int Mark1;
	private int Mark2;
	private int Mark3;
	private int totalMark;
	private int percentage;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMark1() {
		return Mark1;
	}
	public void setMark1(int mark1) {
		Mark1 = mark1;
	}
	public int getMark2() {
		return Mark2;
	}
	public void setMark2(int mark2) {
		Mark2 = mark2;
	}
	public int getMark3() {
		return Mark3;
	}
	public void setMark3(int mark3) {
		Mark3 = mark3;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
