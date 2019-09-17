package com.nt.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceAppConfig.class})
public class RootAppConfig {
	public RootAppConfig() {
		System.out.println("*******************RootAppConfig***************");
	}
}
