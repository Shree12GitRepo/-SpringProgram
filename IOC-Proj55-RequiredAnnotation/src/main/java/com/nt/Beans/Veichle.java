package com.nt.Beans;

import org.springframework.beans.factory.annotation.Required;

public class Veichle {
	private String ModelName;
	private String veichleType;
	private Engine engg;
	
	@Required
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	@Required
	public void setVeichleType(String veichleType) {
		this.veichleType = veichleType;
	}
	@Required
	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	@Override
	public String toString() {
		return "Veichle [ModelName=" + ModelName + ", veichleType=" + veichleType + ", engg=" + engg + "]";
	}
}
