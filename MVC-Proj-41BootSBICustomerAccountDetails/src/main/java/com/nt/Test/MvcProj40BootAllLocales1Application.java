package com.nt.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.Config.RootAppConfig;
import com.nt.Config.WebMvcConfig;

@SpringBootApplication
@Import({WebMvcConfig.class,RootAppConfig.class})
public class MvcProj40BootAllLocales1Application {

	public static void main(String[] args) {
		SpringApplication.run(MvcProj40BootAllLocales1Application.class, args);
	}

}
