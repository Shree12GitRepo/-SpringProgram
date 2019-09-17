package com.EmployeeSearch.BO;

public class EmployeeSearchResultListBO extends EmployeeBO{
	//define the gross_sal and Net_sal...
	private float emp_grossSal;
	private float emp_NetSal;
	private String emp_name;
	private float emp_basicSal;
	
	//set The properties
	public void setEmp_grossSal(float emp_grossSal) {
		this.emp_grossSal = emp_grossSal;
	}
	public void setEmp_NetSal(float emp_NetSal) {
		this.emp_NetSal = emp_NetSal;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setEmp_basicSal(float emp_basicSal) {
		this.emp_basicSal = emp_basicSal;
	}

}
