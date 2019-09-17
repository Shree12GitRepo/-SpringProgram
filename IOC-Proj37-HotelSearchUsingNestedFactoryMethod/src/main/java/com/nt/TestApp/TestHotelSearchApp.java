package com.nt.TestApp;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.nt.Controller.HotelSearchController;
import com.nt.DTO.HotelSearchDTO;

public class TestHotelSearchApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory pfactory, cfactory = null;
		XmlBeanDefinitionReader preader, creader = null;
		List<HotelSearchDTO> liDTO = null;
		// parent container...
		pfactory = new DefaultListableBeanFactory();
		preader = new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("com/nt/cfgs/Service-beans.xml");
		// child container...
		cfactory = new DefaultListableBeanFactory(pfactory);
		creader = new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/nt/cfgs/Presentation-beans.xml");

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

	}

}
