package com.nt.cfgs;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.nt.DAO")
@PropertySource("classpath:com/nt/commons/jdbc.properties")
public class PersistenceConfig {
	@Autowired
	Environment env;
	@Bean("ds")
	public BasicDataSource createDataSource() {
		BasicDataSource bdsc=null;
		bdsc=new BasicDataSource();
		bdsc.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		bdsc.setUrl(env.getProperty("jdbc.url"));
		bdsc.setUsername(env.getProperty("jdbc.username"));
		bdsc.setPassword(env.getProperty("jdbc.password"));
		return  bdsc;
	}
}
