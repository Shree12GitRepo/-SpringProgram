package com.nt.FactoryBean;

public class IRCTC {
	private int	trainNo;
	private String trainName;
	
	public IRCTC(int trainNo, String trainName) {
		System.out.println("IRCTC::2-Param");
		this.trainNo = trainNo;
		this.trainName = trainName;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public String getTrainName() {
		return trainName;
	}
	
}
