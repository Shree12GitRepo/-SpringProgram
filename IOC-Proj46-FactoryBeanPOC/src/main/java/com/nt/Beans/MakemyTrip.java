package com.nt.Beans;

import com.nt.FactoryBean.IRCTC;

public class MakemyTrip {
	private IRCTC irctc;
	private String passengername;
	private String from;
	private String to;
	
	public MakemyTrip() {
		System.out.println("MakemyTrip::0-param");
	}
	
	public void setIrctc(IRCTC irctc) {
		this.irctc = irctc;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}

	public void trainTicket() {
		System.out.println("*************Train Ticket***************");
		System.out.println("Passenger Name::"+passengername);
		System.out.println("Source::"+from);
		System.out.println("Destination::"+to);
		System.out.println("Train No::"+irctc.getTrainNo());
		System.out.println("Train Name::"+irctc.getTrainName());
	}

}
