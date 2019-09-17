package com.nt.Beans;

import java.util.Arrays;

public class Kashmir {
	private String districts[];
	private float area;
	private String capitals;
	
	public Kashmir() {
		System.out.println("Kashmir::0-Param");
	}

	public void setDistricts(String[] districts) {
		this.districts = districts;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public void setCapitals(String capitals) {
		this.capitals = capitals;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Kashmir [districts="
				+ (districts != null ? Arrays.asList(districts).subList(0, Math.min(districts.length, maxLen)) : null)
				+ ", area=" + area + ", capitals=" + capitals + "]";
	}
	
	
}
