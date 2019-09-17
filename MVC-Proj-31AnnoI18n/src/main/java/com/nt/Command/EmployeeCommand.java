package com.nt.Command;

public class EmployeeCommand {
	private int id;
	private String name;
	private String addrs;
	private float salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddrs() {
		return addrs;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [id=" + id + ", name=" + name + ", addrs=" + addrs + ", salary=" + salary + "]";
	}
	
	

}
