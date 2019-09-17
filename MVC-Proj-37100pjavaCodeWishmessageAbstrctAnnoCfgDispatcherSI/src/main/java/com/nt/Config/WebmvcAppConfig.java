package com.nt.Config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.nt.*")
public class WebmvcAppConfig {
	
	public WebmvcAppConfig() {
		System.out.println("**************WebmvcAppConfig 0-Param*********");
	}
	@Bean
	public HandlerMapping CreateHandlerMapping() {
		System.out.println("************CreateHandlerMapping()***********");
		SimpleUrlHandlerMapping handlerMapping=null;
		Properties mappings=null;
		handlerMapping=new SimpleUrlHandlerMapping();
		mappings=new Properties();
		mappings.put("/home.htm", "pvc1");
		handlerMapping.setMappings(mappings);
		return handlerMapping;
	}
	@Bean(name="pvc1")
	public Controller createController() {
		System.out.println("*************createController()**************");
		ParameterizableViewController ctrl=null;
		ctrl=new ParameterizableViewController();
		ctrl.setViewName("welcome");
		return ctrl;
		
	}
	@Bean
	public ViewResolver CreateViewResolver() {
		System.out.println("***********CreateViewResolver()*************");
		InternalResourceViewResolver resolver =null;
		resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
