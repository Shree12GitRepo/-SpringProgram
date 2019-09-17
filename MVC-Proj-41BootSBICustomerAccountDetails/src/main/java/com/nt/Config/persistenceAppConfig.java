package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.DAO")
public class persistenceAppConfig {
	
	public persistenceAppConfig() {
		System.out.println("***************persistenceAppConfig***********");
	}

}
