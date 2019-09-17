package com.nt.DTO;

public class HotelSearchDTO {
	private int id;
	private String name;
	private String state;
	private String city;
	private String coupleFriendly;
	private String type;
	
	public HotelSearchDTO() {
		System.out.println("HotelSearchBO::0-Param");
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getCoupleFriendly() {
		return coupleFriendly;
	}
	public String getType() {
		return type;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCoupleFriendly(String coupleFriendly) {
		this.coupleFriendly = coupleFriendly;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "HotelSearchBO [id=" + id + ", name=" + name + ", state=" + state + ", city=" + city
				+ ", coupleFriendly=" + coupleFriendly + ", type=" + type + "]";
	}
}
