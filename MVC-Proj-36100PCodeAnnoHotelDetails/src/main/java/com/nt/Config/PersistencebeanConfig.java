package com.nt.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.nt.DAO")
public class PersistencebeanConfig {
	public PersistencebeanConfig() {
		System.out.println("***************PersistencebeanConfig*********");
	}
	@Bean
	public JndiObjectFactoryBean createFactoryBean() {
		System.out.println("*****createFactoryBean()*****");
		JndiObjectFactoryBean factorybean=null;
		factorybean=new JndiObjectFactoryBean();
		factorybean.setJndiName("java:/comp/env/DSJNDI");
		return factorybean;
	}
	@Bean
	public JdbcTemplate createjdbcTemplate(JndiObjectFactoryBean jofb) {
		System.out.println("*******createjdbcTemplate()*******");
		return new JdbcTemplate((DataSource) jofb.getObject());
		
	}
}
