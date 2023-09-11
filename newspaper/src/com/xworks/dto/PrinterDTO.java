package com.xworks.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable {
	private String name;
	private int price;

	public PrinterDTO() {

	}
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof PrinterDTO )
			{
				if(obj==name )
				{
					System.out.println("it is equal");
				}
			}
		}
		return false;
	}

	public PrinterDTO(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "PrinterDTO[name=" + name + ",price=" + price + "]";

	}
}