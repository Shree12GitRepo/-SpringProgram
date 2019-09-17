package com.CP.Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.CP.Command.CustomerCommand;

@Controller
@SessionAttributes("cmd")
public class CustomerFormController {
	

	// Show CustomerForm page...
	@RequestMapping(name = "/customer.htm", method = RequestMethod.GET)
	public String CustomerForm(@ModelAttribute("cmd") CustomerCommand cmd) {
		System.out.println("-------Customer Form Called---------");
		
		// set Form data..
		cmd.setName("RajSriRaj");
		return "customer_form";
	}
	@ModelAttribute("cmd")
	public CustomerCommand getCustomerCommand() {
		System.out.println("CustomerFormController.getCustomerCommand()");
		return new CustomerCommand();
	}

	@ModelAttribute("countryList")
	public List PopulateCountry() {
		System.out.println("---------CustomerFormController.PopulateCountry()--------");
		List country = new ArrayList();
		country.add("India");
		country.add("Pakistan");
		country.add("UAE");
		country.add("Japan");
		country.add("Germany");

		return country;
	}

	@ModelAttribute("productList")
	public List PopulateProduct() {

		System.out.println("-------CustomerFormController.PopulateProduct()-----------");

		List product = new ArrayList();
		product.add("Shirt");
		product.add("T-Shirt");
		product.add("Leggins");
		product.add("Kurti");
		product.add("lehenga");
		product.add("Washing Machine");

		return product;

	}

	@ModelAttribute("genderList")
	public List PopulateGender() {
		System.out.println("----------CustomerFormController.PopulateGender()--------");
		List gender = new ArrayList();
		gender.add("Male");
		gender.add("Female");
		return gender;
	}
	
	//Init binder...
	@InitBinder
	public void PopulateDeliveryDate(WebDataBinder binder)
	{
		SimpleDateFormat format=null;
		format=new SimpleDateFormat("dd/MM/yyyy");
		//prepare Custom Date Editor..
		CustomDateEditor dtEdtr=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, dtEdtr);
	}

	@RequestMapping(name = "/customer.htm", method = RequestMethod.POST)
	public String processCustomerForm(Map<String, Object> map, @Valid @ModelAttribute("cmd") CustomerCommand cmd,
			BindingResult result) {
		System.out.println("--------------CustomerFormController.processCustomerForm()----");
		
		if (result.hasErrors()) {
			return "customer_form";
		}
		map.put("cmdData", cmd);
		return "customer_form";

	}
}
