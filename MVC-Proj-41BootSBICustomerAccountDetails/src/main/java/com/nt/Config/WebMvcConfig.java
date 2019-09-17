package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.Controller")
public class WebMvcConfig {
	
	public WebMvcConfig() {
		System.out.println("*************WebMvcConfig**************");
	}
}
