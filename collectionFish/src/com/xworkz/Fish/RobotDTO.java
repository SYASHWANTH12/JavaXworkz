package com.xworkz.Fish;

import java.util.InputMismatchException;

public class RobotDTO implements Comparable<RobotDTO>{
/**
	 * @param price
	 * @param name
	 * @param madeBy
	 * @param working
	 */
	public RobotDTO(int price, String name, String madeBy, boolean working) {
		super();
		this.price = price;
		this.name = name;
		this.madeBy = madeBy;
		this.working = working;
	}
int price;
String name;
String madeBy;
boolean working;
@Override
public String toString() {
	return "RobotDTO [price=" + price + ", name=" + name + ", madeBy=" + madeBy + ", working=" + working + "]";
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMadeBy() {
	return madeBy;
}
public void setMadeBy(String madeBy) {
	this.madeBy = madeBy;
}
public boolean isWorking() {
	return working;
}
public void setWorking(boolean working) {
	this.working = working;
}
@Override
public int compareTo(RobotDTO o) {
	RobotDTO robo=this;
	
	if(robo.price==o.price) {
		return 0;
	}
	if(robo.price>o.price)
	{
		return -33;
	}
	if(robo.price>o.price)
	{
		return 5678;
	}
	throw new InputMismatchException();
}
}
