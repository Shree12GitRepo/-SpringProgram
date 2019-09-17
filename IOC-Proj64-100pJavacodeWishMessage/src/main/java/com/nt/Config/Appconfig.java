package com.nt.Config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nt.beans.WeatherReport;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class Appconfig {
	
	public Appconfig() {
		System.out.println("Appconfig.Appconfig()");
	}
	//Predefined Method as bean Cfgs..
	@Bean
	@Primary
	public Calendar createCalender1() {
		System.out.println("Appconfig.createCalender1()");
		return Calendar.getInstance();
	}
	
	@Bean
	public Calendar createCalender2() {
		System.out.println("Appconfig.createCalender2()");
		return Calendar.getInstance();
	}
	@Bean
	public WeatherReport createReport() {
		System.out.println("Appconfig.createReport()");
		return new WeatherReport();
	}
	
}
