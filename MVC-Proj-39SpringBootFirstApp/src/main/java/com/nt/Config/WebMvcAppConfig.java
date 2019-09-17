package com.nt.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.nt.Controller")
public class WebMvcAppConfig {
	public WebMvcAppConfig() {
		System.out.println("WebMvcAppConfig.WebMvcAppConfig()");
	}
	
	

}
