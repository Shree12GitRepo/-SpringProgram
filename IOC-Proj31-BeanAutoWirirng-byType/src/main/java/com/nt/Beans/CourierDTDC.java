package com.nt.Beans;

public class CourierDTDC {
	private String cusname;
	private String location;
	private String item;
	private double price;
	
	public CourierDTDC() {
		System.out.println("CourierDTDC::0Param");
	}

	public String getCusname() {
		return cusname;
	}



	public String getLocation() {
		return location;
	}



	public double getPrice() {
		return price;
	}



	public void setCusname(String cusname) {
		this.cusname = cusname;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "CourierDTDC [cusname=" + cusname + ", location=" + location + ", item=" + item + ", price=" + price
				+ "]";
	}

	
}
