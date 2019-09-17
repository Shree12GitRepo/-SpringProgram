package com.nt.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.Service.ServiceLocales;

@Controller
public class LocalesController {
	//inject Servicess..
	@Autowired
	private ServiceLocales service;
	
	@GetMapping("/home")
	public String showHome() {
		return "show_locales";
	}
	
	@GetMapping("/Countries.htm")
	public String allCountries(Map<String, Object> map) {
		List countriesList=null;
		//use Serivece..
		countriesList=service.getAllCountries();
		map.put("localeList", countriesList);
		map.put("label", "All Countries Data");
		return "result";
	}
	@GetMapping("/langs.htm")
	public String allLanguages(Map<String, Object> map) {
		List languagesList=null;
		//use Serivece..
		languagesList=service.getAllCountries();
		map.put("localeList", languagesList);
		map.put("label", "All Language Data");
		return "result";
	}
	

}
