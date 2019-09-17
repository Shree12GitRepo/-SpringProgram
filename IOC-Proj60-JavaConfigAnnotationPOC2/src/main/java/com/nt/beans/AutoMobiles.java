package com.nt.beans;

import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Named("amobs")
public class AutoMobiles {
	
	//@Resource(name="ford")
	//@Resource
	//@Named("ford")
	private Car car;
	//@Resource
	Date date;
	
	public AutoMobiles() {
		System.out.println("AutoMobiles.AutoMobiles()-0-param");
	}
	
	//@Inject
	//@Named("ford")
	//@Resource(Not allowed at Constructor label)
	/*public AutoMobiles(@Named("ford")Car car) {
		System.out.println("AutoMobiles.AutoMobiles()-1 Parma");
		this.car = car;
	}*/
	//@Inject
	//@Named("ford")
	 //@Nullable (Not applicable for @Resourcess)
	/*@Resource
	public void setCar(@Named("ford")Car car,Date date) {
		this.car = car;
		this.date=date;
	}*/
	
	//@Inject
	@Resource
	public void assignCar(Car hondacity) {
		System.out.println("AutoMobiles.assignCar()");
		this.car=hondacity;
	}
	
	/*@Inject
	public void assignCar(@Named("hondacity")Car car,@Nullable Date date) {
		System.out.println("AutoMobiles.assignCar()");
		this.car=car;
		this.date=date;
	}*/

	@Override
	public String toString() {
		return "AutoMobiles [car=" + car + ", date=" + date + "]";
	}
	
	
}
