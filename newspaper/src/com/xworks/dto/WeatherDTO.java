package com.xworks.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private String weatherReport;
	private int degree;
	private boolean rain;
	private int celsius;

	public WeatherDTO() {

	}

	public WeatherDTO(String weatherReport, int degree, boolean rain, int celsius) {
		this.weatherReport = weatherReport;
		this.celsius = celsius;
		this.degree = degree;
		this.rain = rain;

	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeatherDTO) {
				//casting and compare properties
				WeatherDTO F=(WeatherDTO)obj;
				if (F.getWeatherReport().equals(this.weatherReport)) {//==
					System.err.println("It is not valid to store");
					return true;
				} else {
					System.out.println("It is  valid to store");
				}
			} else {
				System.err.println("It is not a instance of same ref");
			}
		} else {
			System.err.println("It is pointing to null");
		}
		return false;
	}

	public String getWeatherReport() {
		return weatherReport;
	}

	public void setWeatherReport(String weatherReport) {
		this.weatherReport = weatherReport;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public boolean isRain() {
		return rain;
	}

	public void setRain(boolean rain) {
		this.rain = rain;
	}

	public int getCelsius() {
		return celsius;
	}

	public void setCelsius(int celsius) {
		this.celsius = celsius;
	}

	public String toString() {
		return "WeatherDTO[weatherReport=" + weatherReport + ",degree=" + degree + ",rain=" + rain + ",celsius="
				+ celsius + "]";
	}

}
