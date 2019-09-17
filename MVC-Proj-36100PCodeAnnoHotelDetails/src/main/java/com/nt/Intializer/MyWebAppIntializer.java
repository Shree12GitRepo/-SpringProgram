package com.nt.Intializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.Config.AppConfig;
import com.nt.Config.WebMvcAppConfig;

public class MyWebAppIntializer implements WebApplicationInitializer {
	public MyWebAppIntializer() {
		System.out.println("*********MyWebAppIntializer()**********");
	}

	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("MyWebAppIntializer.onStartup()");
		AnnotationConfigWebApplicationContext parentCtx=null,childCtx=null;
		
		//create Parent Container...
		parentCtx=new AnnotationConfigWebApplicationContext();
		//register parent Container..
		parentCtx.register(AppConfig.class);
		
		//create Child Container...
		childCtx=new AnnotationConfigWebApplicationContext();
		//register Child Container
		childCtx.register(WebMvcAppConfig.class);
		
		//Add ParentContainer into ServletContainer...
		
		ContextLoaderListener listener=null;
		listener=new ContextLoaderListener(parentCtx);
		sc.addListener(listener);
		
		//Add ChildContainer into ServletContainer..
		System.out.println("Passed");
		DispatcherServlet servlet=null;
		ServletRegistration.Dynamic dyna=null;
		servlet = new DispatcherServlet(childCtx);
		dyna=sc.addServlet("dispatcher", servlet);
		dyna.addMapping("*.htm");
		dyna.setLoadOnStartup(2);
		System.out.println("Passed completed");
		
	}

}
