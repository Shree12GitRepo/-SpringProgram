package com.nt.Beans;

import java.util.Arrays;


public class OrderItems {
	private String items[];


	public OrderItems(String[] items) {
		System.out.println("OrderItems:: "+Arrays.toString(items));
		this.items = items;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "OrderItems [items=" + Arrays.toString(items) + "]";
	}


}
