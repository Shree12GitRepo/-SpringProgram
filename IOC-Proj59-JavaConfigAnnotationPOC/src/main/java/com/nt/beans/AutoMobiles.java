package com.nt.beans;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("amobs")
public class AutoMobiles {
	
	//@Inject
	//@Named("ford")
	private Car car;
	
	Date date;
	
	public AutoMobiles() {
		System.out.println("AutoMobiles.AutoMobiles()-0-param");
	}
	
	//@Inject
	//@Named("ford")
	/*public AutoMobiles(@Named("ford")Car car) {
		System.out.println("AutoMobiles.AutoMobiles()-1 Parma");
		this.car = car;
	}*/
	//@Inject
	//@Named("ford")
	/*public void setCar(@Named("ford")Car car) {
		this.car = car;
	}*/
	
	/*@Inject
	public void assignCar(Car hondacity) {
		System.out.println("AutoMobiles.assignCar()");
		this.car=hondacity;
	}*/
	
	@Inject
	public void assignCar(@Named("hondacity")Car car,@Nullable Date date) {
		System.out.println("AutoMobiles.assignCar()");
		this.car=car;
		this.date=date;
	}

	@Override
	public String toString() {
		return "AutoMobiles [car=" + car + ", date=" + date + "]";
	}
	
	
}
