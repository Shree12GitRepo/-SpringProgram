package com.nt.Test;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Beans.IntrestAmountDetails;
import com.nt.Beans.SimpleIntrestAmmount;
import com.nt.editor.CustomIntrestAmountEditor;

public class TestSimpleIntrest {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		BeanDefinitionReader reader=null;
		SimpleIntrestAmmount amount=null;
		factory=new DefaultListableBeanFactory();
		
		//add PropertyEditor Using Nested Inner Class...
		/*
		 * factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
		 * 
		 * public void registerCustomEditors(PropertyEditorRegistry registry) {
		 * registry.registerCustomEditor(IntrestAmountDetails.class,new
		 * CustomIntrestAmountEditor());
		 * 
		 * } });
		 */
		
		//add propertyEditors using LambdaExpression..
		factory.addPropertyEditorRegistrar(registrar->{
			registrar.registerCustomEditor(IntrestAmountDetails.class, new CustomIntrestAmountEditor());
		});
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/Cfgs/ApplicationContext.xml");
		amount=factory.getBean("sia",SimpleIntrestAmmount.class);
		System.out.println(amount.SimpleIntrst());
		
	}
	//add propertyEditors Using Normal inner class....
	/*public static class MyPERRegister implements PropertyEditorRegistrar{

		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(IntrestAmountDetails.class,new CustomIntrestAmountEditor() );
			
		}*/
	
}
