package com.nt.scientist.DTO;

public class ScientistDTO {
	private int id;
	private int srlno;
	private String name;
	private String domainName;
	private int experience;
	private int petents;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDomainName() {
		return domainName;
	}
	public int getExperience() {
		return experience;
	}
	public int getPetents() {
		return petents;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setPetents(int petents) {
		this.petents = petents;
	}
	public int getSrlno() {
		return srlno;
	}
	public void setSrlno(int srlno) {
		this.srlno = srlno;
	}

}
