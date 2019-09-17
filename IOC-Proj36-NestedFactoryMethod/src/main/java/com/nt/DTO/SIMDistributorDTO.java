package com.nt.DTO;

public class SIMDistributorDTO {
	
	private int id;
	private String dname;
	private String location;
	private String simCompany;
	
	public SIMDistributorDTO() {
		System.out.println("SIMDistributorDTO.SIMDistributorDTO()");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSimCompany(String simCompany) {
		this.simCompany = simCompany;
	}
	public int getId() {
		return id;
	}
	public String getDname() {
		return dname;
	}
	public String getLocation() {
		return location;
	}
	public String getSimCompany() {
		return simCompany;
	}

	@Override
	public String toString() {
		return "SIMDistributorDTO [id=" + id + ", dname=" + dname + ", location=" + location + ", simCompany="
				+ simCompany + "]";
	}

}
