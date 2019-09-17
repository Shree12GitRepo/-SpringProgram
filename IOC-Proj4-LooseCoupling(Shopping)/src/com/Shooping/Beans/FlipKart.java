package com.Shooping.Beans;

import java.util.Arrays;

public class FlipKart{
	private Courier courier;

	public void setCourier(Courier courier) {
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}
	public String purchase(String items[]) {
		// call the deliver()..
		String deliver=courier.deliver();
		return "products like "+Arrays.toString(items)+" are "+deliver;
	}

}
