package com.nt.Beans;

import java.util.List;

public class DIplomaCourse {
	private List<String> corse;

	public DIplomaCourse(List<String> corse) {
		
		this.corse = corse;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "DIplomaCourse [corse=" + (corse != null ? corse.subList(0, Math.min(corse.size(), maxLen)) : null)
				+ "]";
	}

}
