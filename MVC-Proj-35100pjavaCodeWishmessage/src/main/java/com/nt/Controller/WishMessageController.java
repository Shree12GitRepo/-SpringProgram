package com.nt.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.Service.WishMessageService;

@Controller
public class WishMessageController {
	//Inject Service...
	@Autowired
	private WishMessageService service;
	
	@RequestMapping("/wish.htm")
	public String wishMessage(Map<String, Object> map) {
		//invoke Service Method..
		String wishMsg=service.generateWishMessage();
		map.put("resultMsg", wishMsg);
		return "welcome";
	}
	

}
