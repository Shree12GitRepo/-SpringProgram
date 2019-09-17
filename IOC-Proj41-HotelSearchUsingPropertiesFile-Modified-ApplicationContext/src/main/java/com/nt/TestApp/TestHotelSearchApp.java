package com.nt.TestApp;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Controller.HotelSearchController;
import com.nt.DTO.HotelSearchDTO;

public class TestHotelSearchApp {

	public static void main(String[] args) {
		ApplicationContext pfactory, cfactory = null;
		List<HotelSearchDTO> liDTO = null;
		// parent container...
		pfactory = new ClassPathXmlApplicationContext("com/nt/cfgs/Service-beans.xml");
		
		// child container...
		cfactory = new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/Presentation-beans.xml"},pfactory);
		
		HotelSearchController ctrl = cfactory.getBean("controller", HotelSearchController.class);
		try {
			liDTO = ctrl.getHotelListBylocation(new String[] { "KAKATPUR","Amerpet" });
			liDTO.forEach(dto->{
				System.out.println(dto);
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) pfactory).close();
		((AbstractApplicationContext) cfactory).close();
		
		//System Properties..
		System.out.println("Properties File--->"+System.getProperties());
	}

}
