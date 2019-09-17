package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.Cfgs.AppConfig;
import com.nt.beans.Personal_Info;

@SpringBootApplication
@Import(AppConfig.class)
public class IocProj67SpringbootBasicAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Personal_Info info=null;
		ctx=SpringApplication.run(IocProj67SpringbootBasicAppApplication.class, args);
		info=ctx.getBean("pi",Personal_Info.class);
		System.out.println(info);
	}

}
