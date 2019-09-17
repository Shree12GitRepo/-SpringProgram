package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pi")
public class Personal_Info {
	@Value("Shree Raj")
	@Autowired
	private String prsonName;
	@Value("7787911006")
	@Autowired
	private long mob_no;
	//@Value("#{new java.text.SimpleDateFormat(\"MM/dd/yyyy\").parse(\"01/01/2018\")}")
	@Autowired
	private Date dob;
	
	public Personal_Info() {
		System.out.println("Personal_Info.Personal_Info()");
	}

	@Override
	public String toString() {
		return "Personal_Info [prsonName=" + prsonName + ", mob_no=" + mob_no + ", dob=" + dob + "]";
	}
}
