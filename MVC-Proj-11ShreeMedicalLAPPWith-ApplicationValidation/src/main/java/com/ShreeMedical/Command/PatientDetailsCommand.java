package com.ShreeMedical.Command;

import java.util.Date;

public class PatientDetailsCommand {
	public PatientDetailsCommand() {
		System.out.println("Command-class::0Param Constructor");
		
	}
	private String pname;
	private String padd;
	private String disease;
	private String doctors;
	//private Date regeistrationdate;
	public String getPname() {
		return pname;
	}
	public String getPadd() {
		return padd;
	}
	public String getDisease() {
		return disease;
	}
	public String getDoctors() {
		return doctors;
	}

	/*
	 * public Date getRegeistrationdate() { return regeistrationdate; }
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	/*
	 * public void setRegeistrationdate(Date regeistrationdate) {
	 * this.regeistrationdate = regeistrationdate; }
	 */
	
	
}
