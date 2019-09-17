package com.nt.Cfgs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	//cretae Date Class Object..
	@Bean
	public Date createDate() throws ParseException {
		//String date="12/05/1995";
		//Date dt=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		return new Date();
	}
}
