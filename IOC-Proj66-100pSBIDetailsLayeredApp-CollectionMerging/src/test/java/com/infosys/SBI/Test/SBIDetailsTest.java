package com.infosys.SBI.Test;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.Infosys.SBI.Contorller.SBIDetailsController;
import com.Infosys.SBI.VO.SBIDetailsVO;

public class SBIDetailsTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		SBIDetailsController ctrl=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------------SBI Bank Details-----------------------------");
		
		System.out.println("Enter the BranchName: ");
		String brnchName=sc.nextLine();
		
		System.out.println("Enter the Branch Manager Name ");
		String brnch_mgr_Name=sc.nextLine();
		
		System.out.println("Enter the Bank Manager Name ");
		String bnk_mgr_Name=sc.nextLine();
		
		System.out.println("Enter the Accountant Name ");
		String Acct_name=sc.nextLine();
		
		System.out.println("Enter the Security Guard Name ");
		String Scrt_guardName=sc.nextLine();
		
		System.out.println("Enter the IFSC Code ");
		int ifsc_code=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Date Of Joining ");
		String sdt=sc.nextLine();
		
	SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		
		System.out.println(sdt);
		Date dt=new Date();
		
		try {
			dt = format.parse(sdt);
			System.out.println(dt);
			//create vo class Object..
			SBIDetailsVO vo=null;
			vo=new SBIDetailsVO();
			vo.setAccountant_Name(Acct_name);
			vo.setBank_Mgr_Name(bnk_mgr_Name);
			vo.setBranch_Mgr_Name(brnch_mgr_Name);
			vo.setIfsc_code(ifsc_code);
			vo.setBranch_name(brnchName);
			vo.setDoj(dt);
			System.out.println(vo);
			//create IOC container..
			
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/Infosys/SBI/Cfgs/ApplicationContext.xml");
			ctrl=factory.getBean("SBIctrl",SBIDetailsController.class);
			ctrl.registartion_SBIDetails(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
