package com.SDP.TestDrive;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.SDP.Factory.FactoryClassPOC;
import com.SDP.Veichle.veichle;

public class Journey {
	
	public static void main(String[] args) {
		Properties prop=null;
		
		//Locate the properties file..
		try {
			InputStream is=new FileInputStream("src/application.properties");
			//cretae the property Object
			prop=new Properties();
			//load the properties file
			prop.load(is);			
			String engMode=prop.getProperty("engType");
			
			System.out.println(engMode);
			//get the depenedent class Object..
			veichle vchl=FactoryClassPOC.getInstance(prop.getProperty(engMode));
			vchl.journey("Odisha", "HYD");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
