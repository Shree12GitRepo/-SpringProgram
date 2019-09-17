package com.nt.Commnad;

import java.util.Arrays;
import java.util.Date;

public class AccidentFormCommand {
	
	public AccidentFormCommand() {
		System.out.println("*************AccidentFormCommand*********");
	}
	private String[] reportingAccident;
	private String personReportingfirstName;
	private String personReportinglastName;
	private String personinvolvedInIncidentfirstNsme;
	private String personinvolvedInIncidentlastName;
	private Date incidentDate;
	private String incidentTime;
	private String locationOfIncident;
	private String event;
	private String[] damageOfProperty;
	private String fisrstAid;
	private String[] avoidIncident;
	private String signature;
	public String[] getReportingAccident() {
		return reportingAccident;
	}
	public String getPersonReportingfirstName() {
		return personReportingfirstName;
	}
	public String getPersonReportinglastName() {
		return personReportinglastName;
	}
	public String getPersoninvolvedInIncidentfirstNsme() {
		return personinvolvedInIncidentfirstNsme;
	}
	public String getPersoninvolvedInIncidentlastName() {
		return personinvolvedInIncidentlastName;
	}
	public Date getIncidentDate() {
		return incidentDate;
	}
	public String getIncidentTime() {
		return incidentTime;
	}
	public String getLocationOfIncident() {
		return locationOfIncident;
	}
	public String getEvent() {
		return event;
	}
	public String[] getDamageOfProperty() {
		return damageOfProperty;
	}
	public String getFisrstAid() {
		return fisrstAid;
	}
	public String[] getAvoidIncident() {
		return avoidIncident;
	}
	public String getSignature() {
		return signature;
	}
	public void setReportingAccident(String[] reportingAccident) {
		this.reportingAccident = reportingAccident;
	}
	public void setPersonReportingfirstName(String personReportingfirstName) {
		this.personReportingfirstName = personReportingfirstName;
	}
	public void setPersonReportinglastName(String personReportinglastName) {
		this.personReportinglastName = personReportinglastName;
	}
	public void setPersoninvolvedInIncidentfirstNsme(String personinvolvedInIncidentfirstNsme) {
		this.personinvolvedInIncidentfirstNsme = personinvolvedInIncidentfirstNsme;
	}
	
	public void setPersoninvolvedInIncidentlastName(String personinvolvedInIncidentlastName) {
		this.personinvolvedInIncidentlastName = personinvolvedInIncidentlastName;
	}
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}
	public void setIncidentTime(String incidentTime) {
		this.incidentTime = incidentTime;
	}
	public void setLocationOfIncident(String locationOfIncident) {
		this.locationOfIncident = locationOfIncident;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public void setDamageOfProperty(String[] damageOfProperty) {
		this.damageOfProperty = damageOfProperty;
	}
	public void setFisrstAid(String fisrstAid) {
		this.fisrstAid = fisrstAid;
	}
	public void setAvoidIncident(String[] avoidIncident) {
		this.avoidIncident = avoidIncident;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "AccidentFormCommand [reportingAccident="
				+ (reportingAccident != null
						? Arrays.asList(reportingAccident).subList(0, Math.min(reportingAccident.length, maxLen))
						: null)
				+ ", personReportingfirstName=" + personReportingfirstName + ", personReportinglastName="
				+ personReportinglastName + ", personinvolvedInIncidentfirstNsme=" + personinvolvedInIncidentfirstNsme
				+ ", personinvolvedInIncidentlastName=" + personinvolvedInIncidentlastName + ", incidentDate="
				+ incidentDate + ", incidentTime=" + incidentTime + ", locationOfIncident=" + locationOfIncident
				+ ", event=" + event + ", damageOfProperty="
				+ (damageOfProperty != null
						? Arrays.asList(damageOfProperty).subList(0, Math.min(damageOfProperty.length, maxLen))
						: null)
				+ ", fisrstAid=" + fisrstAid + ", avoidIncident="
				+ (avoidIncident != null
						? Arrays.asList(avoidIncident).subList(0, Math.min(avoidIncident.length, maxLen))
						: null)
				+ ", signature=" + signature + "]";
	}
	
	
}
