package com.xworkz.news.util;

public class Encapsulation {
	private String name;
	private int number;
	private float cost;
	private char brand;
public Encapsulation() {
	
}
	public Encapsulation(String name, int number, float cost, char brand) {
		this.name = name;
		this.number = number;
		this.cost = cost;
		this.brand = brand;
	}

	private void setName(String name) {
		this.name=name;
	}

	private String getName() {
		return name;
	}

	public void setnumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	void setCost(float cost)
	{
		this.cost=cost;
	}
	 float getCost() {
		return cost;
	}
	public void setBrand(char brand)
	{
		this.brand=brand;
	}
	protected char getBrand() {
		return brand;
	}
	

}
