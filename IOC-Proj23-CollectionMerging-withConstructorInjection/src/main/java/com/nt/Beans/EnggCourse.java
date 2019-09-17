package com.nt.Beans;

import java.util.List;

public class EnggCourse  {
	private List<String> corse;
	
	public EnggCourse(List<String> corse) {
		
		this.corse = corse;
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "EnggCourse [corse=" + (corse != null ? corse.subList(0, Math.min(corse.size(), maxLen)) : null) + "]";
	}
	
}
