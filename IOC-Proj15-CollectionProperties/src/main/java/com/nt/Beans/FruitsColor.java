package com.nt.Beans;

import java.util.Set;

public class FruitsColor {
	private Set<String> fruits;

	public FruitsColor(Set<String> fruits) {
		
		this.fruits = fruits;
	}
	//change the Default Set(LinkedHashSet to HashSet)
	private Set chngset;
	
	public void setChngset(Set chngset) {
		this.chngset = chngset;
	}
	
	@Override
	public String toString() {
		return "FruitsColor [fruits=" + fruits + fruits.getClass()+"]";
	}
	
	
}
