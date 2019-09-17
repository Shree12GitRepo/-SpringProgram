package com.nt.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.Commnad.AccidentFormCommand;

@Controller
public class AccidentReport {
	public AccidentReport() {
		System.out.println("***********AccidentReport(0-param)*************");
	}
	@GetMapping
	public String ShowForm(@ModelAttribute("accdntFormCmd")AccidentFormCommand cmd) {
		return "accidentReportForm";
	}
	@ModelAttribute("rprtngaccdList")
	public List Populate_reportingAccidentList() {
		List reportingAccidentList=null;
		reportingAccidentList=new ArrayList();
		reportingAccidentList.add("Loss of time/injury");
		reportingAccidentList.add("Work vehicle accident");
		reportingAccidentList.add("Work accident");
		reportingAccidentList.add("First aid incident");
		reportingAccidentList.add("Observation");
		reportingAccidentList.add("Close Call");
		return reportingAccidentList;
	}
	@ModelAttribute("dmgprprtList")
	public List populate_damageOfProperty() {
		List damageOfProperty=null;
		damageOfProperty=new ArrayList();
		damageOfProperty.add("yes");
		damageOfProperty.add("No");
		return damageOfProperty;
	}
	@ModelAttribute("avdincdntList")
	public List populate_avoidIncident() {
		List avoidIncident=null;
		avoidIncident=new ArrayList();
		avoidIncident.add("yes");
		avoidIncident.add("No");
		return avoidIncident;
	}
	
}
