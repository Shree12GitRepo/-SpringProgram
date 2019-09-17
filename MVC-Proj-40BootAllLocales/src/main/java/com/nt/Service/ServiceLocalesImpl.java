package com.nt.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class ServiceLocalesImpl implements ServiceLocales {
	Locale locales[];
	List Localelist=null;
	
	//get all Languages....
	@Override
	public List<String> getAllLanguages() {
		System.out.println("************getAllLanguages()************");
		locales=Locale.getAvailableLocales();
		Localelist=new ArrayList();
		//get all available Loclaes..
		for(Locale loc:locales) {
			Localelist.add(loc.getDisplayLanguage());
		}
		return Localelist;
	}

	@Override
	public List<String> getAllCountries() {
		System.out.println("************getAllCountries()*************");
		locales=Locale.getAvailableLocales();
		Localelist=new ArrayList();
		//get all available Loclaes..
		for(Locale loc:locales) {
			Localelist.add(loc.getDisplayCountry());
		}
		return Localelist;
	}
	
	

}
