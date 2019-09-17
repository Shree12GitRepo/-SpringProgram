package com.nt.initializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.nt.Config.MvcProj39SpringBootFirstAppApplication;
import com.nt.Config.WebMvcAppConfig;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("ServletInitializer.configure()");
		return application.sources(MvcProj39SpringBootFirstAppApplication.class);
	}

}
