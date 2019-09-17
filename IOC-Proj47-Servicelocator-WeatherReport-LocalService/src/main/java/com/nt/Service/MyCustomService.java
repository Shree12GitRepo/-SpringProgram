package com.nt.Service;

import java.rmi.RemoteException;

public class MyCustomService {
	
	public MyCustomService() {
		System.out.println("*****MCustomService()*****");
	}
	private WeatherreportImpl wrReport;

	public WeatherreportImpl getWrReport() {
		return wrReport;
	}

	public void setWrReport(WeatherreportImpl wrReport) {
		this.wrReport = wrReport;
	}
	
	public float getWeatherReport() throws RemoteException {
		return wrReport.weatherReport();
	}

}
