package com.nt.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


import com.nt.DAO.InsertHotelDetailsDAO;
import com.nt.Service.InsertHotelDetailsService;


@Configuration
@Import({ServicesbeanConfig.class,PersistencebeanConfig.class})
public class AppConfig {
	public AppConfig() {
		System.out.println("*********AppConfig()***********");
	}
}
