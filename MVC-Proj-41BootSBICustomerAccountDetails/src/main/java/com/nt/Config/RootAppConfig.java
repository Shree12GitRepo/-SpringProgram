package com.nt.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({persistenceAppConfig.class,ServicessAppConfig.class})
public class RootAppConfig {
	
	public RootAppConfig() {
		System.out.println("*************RootAppConfig**************");
	}

}
