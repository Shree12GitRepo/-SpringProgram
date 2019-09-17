package com.nt.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebMvcAppConfig.class})
public class MvcProj39SpringBootFirstAppApplication {

	public static void main(String[] args) {
		System.out.println("MvcProj39SpringBootFirstAppApplication.main()");
		SpringApplication.run(MvcProj39SpringBootFirstAppApplication.class, args);
	}

}
