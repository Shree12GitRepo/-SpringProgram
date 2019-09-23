package com.nt.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Student_info.Servicess")
public class ServiceConfig {
	public ServiceConfig() {
		System.out.println("ServiceConfig.ServiceConfig()");
	}
}
