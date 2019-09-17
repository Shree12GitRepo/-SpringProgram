package com.nt.Test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.Controller.SIMDistributorController;
import com.nt.DTO.SIMDistributorDTO;

public class TestSIMDistributorAPP {

	public static void main(String[] args) {
		BeanFactory pfactory,cfactory=null;
		SIMDistributorController controller=null;
		List<SIMDistributorDTO> liDTO=null;
		pfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/business-beans.xml"));
		cfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/presentation-beans.xml"),pfactory);
		controller=cfactory.getBean("SimDstrbtrsCtrl",SIMDistributorController.class);
		
		//get the Distributor name and location..
		try {
			liDTO=controller.getDistributorDetails(new String[]{"AIRTEL","IDEA"});
			System.out.println("---------SIM Distributors List------------");
			liDTO.forEach(dto->{
				System.out.println(dto);
			});
			System.out.println("---------SIM Distributors List------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
