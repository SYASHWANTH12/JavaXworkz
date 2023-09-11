package com.xworks.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {
	private String name;
	private long aadharNumber;
	public AadharDTO() {
		// TODO Auto-generated constructor stub
	}
	public AadharDTO(String name,long aadharNumber) {
		this.name=name;
		this.aadharNumber=aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String toString()
	{
		return "Aadhar[name="+name+",aadharNumber="+aadharNumber+"]";
	}
	
	
	

}
