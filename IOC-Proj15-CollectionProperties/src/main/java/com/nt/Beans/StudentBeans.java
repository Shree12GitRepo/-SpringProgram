package com.nt.Beans;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StudentBeans {
	private int rollNo;
	private String name;
	private long marks[];
	private List<Date> date;

	/*
	 * public void setDate(List<Date> date) { this.date = date; }
	 */

	
	  
	  public StudentBeans(List<Date> date) { this.date = date; }
	 

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(long[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentBeans [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", date="
				+ date + "]";
	}

}
