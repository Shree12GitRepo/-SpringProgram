package com.nt.customer.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.customer.Command.CustomerCommand;

public class CustomerControler extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res, CustomerCommand cmd) {
		System.out.println("insert Operation");
		System.out.println(cmd.getCname()+"--->"+cmd.getCadd()+"--->"+cmd.getCmob());
		return new ModelAndView("CustomerForm", "insertOperation", "Inserted Successfully");
	}
	
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res, CustomerCommand cmd) {
		System.out.println("Update Operation");
		System.out.println(cmd.getCname()+"--->"+cmd.getCadd()+"--->"+cmd.getCmob());
		return new ModelAndView("CustomerForm", "UpdateOperation", "Updated Successfully");
	}
	
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res, CustomerCommand cmd) {
		System.out.println("Delete Operation");
		System.out.println(cmd.getCname()+"--->"+cmd.getCadd()+"--->"+cmd.getCmob());
		return new ModelAndView("CustomerForm", "DeleteOperation", "Deleted Successfully");
	}
	public ModelAndView invalied(HttpServletRequest req,HttpServletResponse res, CustomerCommand cmd) {
		System.out.println("Delete Operation");
		System.out.println(cmd.getCname()+"--->"+cmd.getCadd()+"--->"+cmd.getCmob());
		return new ModelAndView("CustomerForm", "DeleteOperation", "Deleted Successfully");
	}
	

}
