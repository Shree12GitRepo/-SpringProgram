package com.nt.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.Student_info.MainController")
@Import({ServiceConfig.class,persistenceConfig.class})
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
		
	}
}
