package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.Service")
public class ServicessAppConfig {
	public ServicessAppConfig() {
		System.out.println("*************ServicessAppConfig************");
	}
}
