package com.nt.Beans;

public class SimpleIntrestAmmount {
	
	private IntrestAmountDetails iad;

	public void setIad(IntrestAmountDetails iad) {
		this.iad = iad;
	}
	
	public float SimpleIntrst() {
		return (iad.getpAmt()*iad.getRate()*iad.getTime())/100f;
	}
}
