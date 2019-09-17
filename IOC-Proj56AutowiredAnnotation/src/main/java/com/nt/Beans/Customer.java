package com.nt.Beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	@Autowired
	private Date dt;
	//field
	//@Autowired
	//@Qualifier("bk2")
	private Bank bank;
	
	public Customer() {
		System.out.println("Customer.Customer(0-Param)");
	}
	//parameterized Constructor... with taarget class Constructor param name and dependent bean id name must match
	@Autowired
	public Customer(Bank bk1) {
		System.out.println("Customer.Customer(-)Param");
		this.bank=bk1;
	}
	
	//Same effect we can bring by using Qualifier
	/*@Autowired
	public Customer(@Qualifier("bk1")Bank bank) {
		System.out.println("Customer.Customer(-)Param");
		this.bank=bank;
	}*/

	
	/* @Autowired 
	 public Customer(@Qualifier("bk2")Bank bank,Date dt) {
	  System.out.println("Customer.Customer(-,-)Param"); this.bank=bank;
	  this.dt=dt;
	 
	 }*/
	 
	//Orbitary Method
	/*
	 * @Autowired
	 * 
	 * @Qualifier("bk1") public void checkcustomerBank(Bank bank) {
	 * System.out.println("Customer.checkcustomerBank()"); this.bank=bank; }
	 */
	@Override
	public String toString() {
		return "Customer [bank=" + bank + "]";
	}
	
	

}
