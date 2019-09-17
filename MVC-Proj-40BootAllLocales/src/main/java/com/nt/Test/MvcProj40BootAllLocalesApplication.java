package com.nt.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.Config.RootAppConfig;
import com.nt.Config.WebMvcAppConfig;

@SpringBootApplication
@Import({WebMvcAppConfig.class,RootAppConfig.class})
public class MvcProj40BootAllLocalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcProj40BootAllLocalesApplication.class, args);
	}

}
