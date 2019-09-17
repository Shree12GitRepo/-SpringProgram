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
 /*	@Bean
	public ViewResolver createViewResolver() {
		System.out.println("WebMvcAppConfig.createViewResolver()");
		InternalResourceViewResolver resolver=null;
		resolver=new InternalResourceViewResolver();
		//Set the Physical Location of View Page..
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
 */	
}
