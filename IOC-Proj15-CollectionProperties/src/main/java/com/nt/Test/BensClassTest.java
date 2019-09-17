package com.nt.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.FacultyProfile;
import com.nt.Beans.FruitsColor;
import com.nt.Beans.MonthDays;
import com.nt.Beans.OrderItems;
import com.nt.Beans.SimTypes;
import com.nt.Beans.StudentBeans;

public class BensClassTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		//Order Items Bean Object..
		OrderItems items=factory.getBean("OItms",OrderItems.class);
		System.out.println(items);
		//SimType Bean Object..
		SimTypes smtype=factory.getBean("smTpe",SimTypes.class);
		System.out.println(smtype);
		
		//Student Bean class Object..
		StudentBeans std=factory.getBean("com.nt.Beans.StudentBeans#0",StudentBeans.class);
		//StudentBeans std1=factory.getBean("com.nt.Beans.StudentBeans#1",StudentBeans.class);
		System.out.println(std);
		//FruitColor Class Cofiguration..
		FruitsColor color=factory.getBean("fruits",FruitsColor.class);
		System.out.println(color);
		
		//MotnthDays Class Object..
		MonthDays mnds=factory.getBean("dmnth", MonthDays.class);
		System.out.println(mnds);
		
		//FacultyProfile Class Object..
		FacultyProfile fProfile=factory.getBean("facultyprof",FacultyProfile.class);
		System.out.println(fProfile);
		
	}

}
