package com.nt.scientist.Command;

public class ScientistCommand {
	
	public ScientistCommand() {
		System.out.println("ScientistCommand::0 param");
	}
	
	private int id;
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
	@Override
	public String toString() {
		return "ScientistCommand [id=" + id + ", name=" + name + ", domainName=" + domainName + ", experience="
				+ experience + ", petents=" + petents + "]";
	}
	

}
