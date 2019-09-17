package com.Employeee.Service;

public class EmployeeServiceIMPL implements EmployeeService {
	static float basicsal=34000;
	@Override
	public float netSalary() {
		return basicsal*0.2f+basicsal;
	}

	@Override
	public float grossSalary() {
		// TODO Auto-generated method stub
		return basicsal*0.3f-basicsal;
	}

}
