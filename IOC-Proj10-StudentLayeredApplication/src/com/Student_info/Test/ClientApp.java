package com.Student_info.Test;

import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.Student_info.MainController.MainController;
import com.Student_info.VO.StudentVO;

public class ClientApp {

	public static void main(String[] args) {
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
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/Student_info/cfgs/ApplicationContext.xml"));
		MainController mctrl=factory.getBean("ctrl",MainController.class);
		mctrl.Student_infoRegistration(vo);
		
	}

}
