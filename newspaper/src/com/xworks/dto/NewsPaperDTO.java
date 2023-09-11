package com.xworks.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable{
	private int cost;
	private String name;
	private String brand;
	private double price;
	
	public NewsPaperDTO(int cost,String name,String brand,double price) {
		this.cost=cost;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString()
	{
		return "NewsPaperDTO[cost="+cost+",name="+name+" ,brand="+brand+",price="+price+"]";
	}

}
