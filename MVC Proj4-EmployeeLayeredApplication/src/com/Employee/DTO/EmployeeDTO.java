package com.Employee.DTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	private int employeeNo;
	private String employeeName;
	private float empBasicSal;
	private float empNetSal;
	public float getEmpNetSal() {
		return empNetSal;
	}

	public void setEmpNetSal(float empNetSal) {
		this.empNetSal = empNetSal;
	}

	public float getEmpgrossSal() {
		return empgrossSal;
	}

	public void setEmpgrossSal(float empgrossSal) {
		this.empgrossSal = empgrossSal;
	}
	private float empgrossSal;
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO::1Param");
	}
	
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmpBasicSal() {
		return empBasicSal;
	}
	public void setEmpBasicSal(float empBasicSal) {
		this.empBasicSal = empBasicSal;
	}
	
}
