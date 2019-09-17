package com.nt.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class})
public class AppConfig {
	public AppConfig() {
		System.out.println("***********AppConfig()**************");
	}

}
