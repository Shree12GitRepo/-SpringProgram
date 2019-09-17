package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelTruptiTemplates {
	@RequestMapping("/home.htm")
	public String Homepage() {
		return "page1";
	}
	@RequestMapping("/about.htm")
	public String aboutPage() {
		return "page2";
	}
	@RequestMapping("/service.htm")
	public String servicePage() {
		return "page3";
	}
	@RequestMapping("/contact.htm")
	public String contactPage() {
		return "page4";
	}
}
