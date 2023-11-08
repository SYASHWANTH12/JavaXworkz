package com.xworkz.Fish;

import java.io.Serializable;

public class PizzaDTO implements Serializable,Comparable<PizzaDTO> {
/**
	 * @param name
	 * @param price
	 * @param size
	 */
	private String name;
	private Double price;
	private String size;
	public PizzaDTO(String name, Double  price, String size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
@Override
public String toString() {
	return "PizzaDTO [name=" + name + ", price=" + price + ", size=" + size + "]";
}
@Override
public int compareTo(PizzaDTO o) {
	
	return o.price.compareTo(this.price);
}

}
