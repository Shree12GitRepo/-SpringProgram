package com.nt.Beans;

public class Target {
	private Dependent depen;

	public Target() {
		System.out.println("Target.Target()");
	}
	public void setDepen(Dependent depen) {
		this.depen = depen;
	}
	@Override
	public String toString() {
		return "Target [depen=" + depen + "]";
	}
	

}
