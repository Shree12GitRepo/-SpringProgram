package com.nt.Beans;

import java.util.List;

public class EnggCourse {
	private List<String> corse;
	public EnggCourse() {
		System.out.println("EnggCourse.EnggCourse()");
	}
	public void setCorse(List<String> corse) {
		System.out.println("EnggCourse.setCorse()");
		this.corse = corse;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "EnggCourse [corse=" + (corse != null ? corse.subList(0, Math.min(corse.size(), maxLen)) : null) + "]";
	}

}
