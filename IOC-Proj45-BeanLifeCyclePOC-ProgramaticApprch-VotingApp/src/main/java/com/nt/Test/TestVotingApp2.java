package com.nt.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.VotingBeans.checkVotingrights;

/**
 * Voting App test
 * 	If you are giving no name and age value in xml file then validation msg will show..
 * 
 * 	If you are giving less than 18 years as per Indain government policy Voting rights 
 * 	then you will get Validation msg..
 *  
 *	If you are giving correct name and age then you will get Success msg..
 */
public class TestVotingApp2 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory factory=null;
    	checkVotingrights vtngrghts=null;
    	factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=null;
    	reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nt/Cfgs/ApplicationContext.xml");
    	
    	vtngrghts=factory.getBean("cvr",checkVotingrights.class);
        System.out.println(vtngrghts );
        factory.destroySingletons();
    }
}
