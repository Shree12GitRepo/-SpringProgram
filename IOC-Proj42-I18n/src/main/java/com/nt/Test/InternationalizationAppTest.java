package com.nt.Test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class InternationalizationAppTest {

	public static void main(String[] args) {
		Locale locale= null;
		ApplicationContext ctx=null;
		JFrame jf=null;
		JButton btn1=null,btn2=null,btn3=null;
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/Cfgs/ApplicationContext.xml");
		locale= new Locale(args[0], args[1]);
		String s1=ctx.getMessage("cap1", null, locale);
		String s2=ctx.getMessage("cap2", null, locale);
		String s3=ctx.getMessage("cap3", null, locale);
		//create Frame..
		jf=new JFrame();
		jf.setSize(300, 500);
		jf.setLayout(new FlowLayout());
		//create button...
		btn1=new JButton(s1);
		btn2=new JButton(s2);
		btn3=new JButton(s3);
		//Add btn into Jframe.
		jf.add(btn1);
		jf.add(btn2);
		jf.add(btn3);
		
		jf.pack();
		jf.setVisible(true);
		//close Container..
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
