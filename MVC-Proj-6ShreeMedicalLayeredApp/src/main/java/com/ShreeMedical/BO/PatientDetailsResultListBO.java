package com.ShreeMedical.BO;

public class PatientDetailsResultListBO extends PatientDetailsBO {
	private String id;
	
	private String padd, disease, doctoConstlnt, registrationDateAndTime;
	public String getId() {
		return id;
	}
	public String getPadd() {
		return padd;
	}
	public String getDisease() {
		return disease;
	}
	public String getDoctoConstlnt() {
		return doctoConstlnt;
	}
	public String getRegistrationDateAndTime() {
		return registrationDateAndTime;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public void setDoctoConstlnt(String doctoConstlnt) {
		this.doctoConstlnt = doctoConstlnt;
	}
	public void setRegistrationDateAndTime(String registrationDateAndTime) {
		this.registrationDateAndTime = registrationDateAndTime;
	}

	@Override
	public String toString() {
		return "PatientDetailsResultListBO [id=" + id + ", padd=" + padd + ", disease=" + disease + ", doctoConstlnt="
				+ doctoConstlnt + ", registrationDateAndTime=" + registrationDateAndTime + "]";
	}
	
	
	
	
}
