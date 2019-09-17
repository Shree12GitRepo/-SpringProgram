package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePage {
	@GetMapping("/home.htm")
	public String showHomepage() {
		System.out.println("HomePage.showHomepage()");
		return "home";
	}
	
	@GetMapping("/login.htm")
	public String loginPage(@RequestParam("person")String personType) {
		System.out.println("HomePage.loginPage()"+personType);
		if(personType.equalsIgnoreCase("stud")) {
			return "student";
		}
		else {
			return "faculty";
		}
		
	}
}
