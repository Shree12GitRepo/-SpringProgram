package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldCtrl {
	
	@GetMapping("/hello")
	public String showHellomsg() {
		System.out.println("HelloWorldCtrl.showHellomsg()");
		return "helloWorld";
	}

}
