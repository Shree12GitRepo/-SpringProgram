package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.Service.WishMessageService;

@Controller
public class WishmessageController {
	@Autowired
	private WishMessageService service;
	
	@RequestMapping("/wishmessage.htm")
	/*public ModelAndView wishMessagegenerator() {
		String msg=service.generatewishMsg();
		return new ModelAndView("wishmessage", "wishmsg", msg);
		
	}*/
	
	/*public String wishMessagegenerator(Model model) {
		String msg=service.generatewishMsg();
		model.addAttribute("wishmsg",msg);
		return "wishmessage";
		
	}*/
	
	/*public String wishMessagegenerator(ModelMap map) {
		String msg=service.generatewishMsg();
		map.addAttribute("wishmsg",msg);
		return "wishmessage";
		
	}*/
	
	/*public String wishMessagegenerator(Map<String,Object> map) {
		String msg=service.generatewishMsg();
		map.put("wishmsg",msg);
		return "wishmessage";
		
	}*/
	
	public void wishMessagegenerator(Map<String,Object> map) {
		String msg=service.generatewishMsg();
		map.put("wishmsg",msg);
	}

	
}
