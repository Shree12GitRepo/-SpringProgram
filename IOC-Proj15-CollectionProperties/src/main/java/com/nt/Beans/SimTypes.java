package com.nt.Beans;

import java.util.List;

public class SimTypes {
	private List Sims;

	public List getSims() {
		return Sims;
	}

	public void setSims(List sims) {
		Sims = sims;
	}



	@Override
	public String toString() {
		return "SimTypes [Sims=" + Sims + "]";
	}

}
