package com.xworkz.Fish;

import java.io.Serializable;
import java.time.LocalDate;

public class IceCream  implements Serializable,Comparable<IceCream>{
	/**
	 * @param name
	 * @param price
	 * @param color
	 */
	public IceCream(String name, Integer price, String color, LocalDate date) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.date=date;
	}
	public String name;
	public Integer price;
	public String color;
	public LocalDate date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	@Override
	public int compareTo(IceCream o) {
	return 	this.price.compareTo(o.price);
	}
	@Override
	public String toString() {
		return "IceCream [name=" + name + ", price=" + price + ", color=" + color + ", date=" + date + "]";
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	

}
