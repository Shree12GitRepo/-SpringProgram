package com.nt.Controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.Command.SBICustomerDetailsCommand;
import com.nt.DTO.SBICustomerDetailsDTO;
import com.nt.Service.SBICustomerDetailsService;

@Controller
public class SBICustomerDetailsController {
	@Autowired
	private SBICustomerDetailsService service;
	
	@GetMapping("/home")
	public String Show_SBICustomerForm(@ModelAttribute("cusCmd") SBICustomerDetailsCommand cmd) {
		return "customer_form";
	}
	@PostMapping("/home")
	public String customerDetails(Map<String, Object> map,@ModelAttribute("cusCmd")SBICustomerDetailsCommand cmd) {
		String acc_No=cmd.getAccountnumber();
		System.out.println(acc_No);
		SBICustomerDetailsDTO dto=null;
		//use Service..
		dto=service.getCustomerDetails(acc_No);
		//copy dto to Cmd...
		System.out.println(dto);
		BeanUtils.copyProperties(dto, cmd);
		map.put("cusDTO", dto);
		return "customer_form";
		
	}
	
}
