package com.nt.Service;

import java.util.Random;

public class WeatherreportImpl implements Weatherreport {

	@Override
	public float weatherReport() {
		float fahrenheit=new Random().nextInt(45);
		//converting Fahrenheit To Celsius....(Celsius = (Fahrenheit – 32) ÷ 1.8)
		float celsius=(float) (fahrenheit-32/1.8);
		return celsius;
	}

}
