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
	
	@GetMapping("/student.htm")
	public String studentloginPage() {
		
		return "student";
		
	}
	
	@GetMapping("/faculty.htm")
	public String facultyloginPage() {
		
		return "faculty";
		
	}
}
