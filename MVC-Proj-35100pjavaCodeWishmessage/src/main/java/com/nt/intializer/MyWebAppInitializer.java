package com.nt.intializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.Config.AppConfig;
import com.nt.Config.WebmvcAppConfig;

public class MyWebAppInitializer implements WebApplicationInitializer {
	
	public MyWebAppInitializer() {
		System.out.println("*****************MyWebAppInitializer()********************");
	}

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("*****************onStartup()******************");
		
		//create webApplicatioin Context...
		AnnotationConfigWebApplicationContext parentCtx=null,childCtx=null;
		
		//register parent Applicatioin Context..
		parentCtx=new AnnotationConfigWebApplicationContext();
		parentCtx.register(AppConfig.class);
		
		//register Child Applicatioin Context...
		childCtx=new AnnotationConfigWebApplicationContext();
		childCtx.register(WebmvcAppConfig.class);
		
		//create ContextloaderListener...
		ContextLoaderListener listener=null;
		listener=new ContextLoaderListener(parentCtx);
		sc.addListener(listener);
		
		//create DispatcherServlet..
		DispatcherServlet servlet=null;
		ServletRegistration.Dynamic dynamicReg=null;
		servlet=new DispatcherServlet(childCtx);
		dynamicReg=sc.addServlet("dispatcher", servlet);
		//Map the Servlet
		dynamicReg.addMapping("*.htm");
		dynamicReg.setLoadOnStartup(2);

	}

}
