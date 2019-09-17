package com.nt.Beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	
	private String enggnumber;
	private String enggCC;
	
	@Required
	public void setEnggnumber(String enggnumber) {
		this.enggnumber = enggnumber;
	}
	@Required
	public void setEnggCC(String enggCC) {
		this.enggCC = enggCC;
	}
	@Override
	public String toString() {
		return "Engine [enggnumber=" + enggnumber + ", enggCC=" + enggCC + "]";
	}

}
