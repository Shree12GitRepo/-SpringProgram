package com.TestMain.Reflection;

import java.lang.reflect.Constructor;

import com.DynamicObject.Reflection.WishMessage;

public class Testmain {

	public static void main(String[] args) {
		try 
		{
			//Load The Class.
			Class c=Class.forName("com.DynamicObject.Reflection.WishMessage");
			//Create the Object Dynamically for Default Constructor
			/*
			 * WishMessage Obj=(WishMessage) c.newInstance(); Obj.setName("Shelu");
			 * System.out.println(Obj.getName());
			 */
			
			//Create the Parameterized Constructor..
			Constructor cons=c.getDeclaredConstructor(String.class);
			//get Access to Private Parameterized Constructor..
			cons.setAccessible(true);
			//create the WishMessage Class Object..
			WishMessage Obj1=(WishMessage) cons.newInstance("Shelu");
			Obj1.setName("Radhe");
			System.out.println(Obj1.getName());
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
