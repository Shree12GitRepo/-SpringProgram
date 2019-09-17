package com.nt.Cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({serviceBeanConfig.class,persistenceBeanasConfig.class})
public class RootAppConfig {
	
	public RootAppConfig() {
		System.out.println("********RootAppConfig*********");
	}
}
