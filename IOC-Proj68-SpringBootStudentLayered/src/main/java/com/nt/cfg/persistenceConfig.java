package com.nt.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Student_info.DAO")
public class persistenceConfig {
	public persistenceConfig() {
		System.out.println("persistenceConfig.persistenceConfig()");
	}
}
