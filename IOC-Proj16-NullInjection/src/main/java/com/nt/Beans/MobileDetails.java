package com.nt.Beans;

import java.util.Map;

public class MobileDetails {
	private Map Sims;
	private String MobileName;
	private String earPhone;
	public MobileDetails(Map sims, String mobileName, String earPhone) {
		Sims = sims;
		MobileName = mobileName;
		this.earPhone = earPhone;
	}
	@Override
	public String toString() {
		return "SimType [Sims=" + Sims + ", MobileName=" + MobileName + ", earPhone=" + earPhone + "]";
	}

}
