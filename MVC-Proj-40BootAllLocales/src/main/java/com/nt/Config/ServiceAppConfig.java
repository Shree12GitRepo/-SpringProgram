package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.Service")
public class ServiceAppConfig {
	public ServiceAppConfig() {
		System.out.println("********************Service App COnfig*********************");
	}
}
