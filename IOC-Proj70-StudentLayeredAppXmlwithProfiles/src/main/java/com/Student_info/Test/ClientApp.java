package com.Student_info.Test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;

import com.Student_info.MainController.MainController;
import com.Student_info.VO.StudentVO;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		ConfigurableEnvironment env=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name ");
		String name=sc.nextLine();
		System.out.println("Enter Student Address ");
		String address=sc.nextLine();
		System.out.println("Enter Student Roll ");
		String roll=sc.nextLine();
		System.out.println("Enter Student Mark1 ");
		String Mark1=sc.nextLine();
		System.out.println("Enter Student mark2 ");
		String Mark2=sc.nextLine();
		System.out.println("Enter Student mark3 ");
		String Mark3=sc.nextLine();
		
		StudentVO vo=new StudentVO();
		vo.setName(name);
		vo.setAddress(address);
		vo.setMark1(Mark1);
		vo.setMark2(Mark2);
		vo.setMark3(Mark3);
		vo.setRoll(roll);
		System.setProperty("spring.profiles.active", "test");
		ctx=new ClassPathXmlApplicationContext("com/nt/Cfgs/Controller-bean.xml");
		MainController mctrl=ctx.getBean("ctrl",MainController.class);
		mctrl.Student_infoRegistration(vo);
		
	}

}
