package com.xworks.dto;

public class CarDTO {
//array,same value ,find,
	private String carName;
	private int cost;

	public CarDTO() {

	}

	public CarDTO(String carName, int cost) {
		this.carName = carName;
		this.cost = cost;

	}
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof CarDTO)
			{
				CarDTO dto=(CarDTO)obj;
				if(dto.getcarName().equals(this.carName))
				{
					System.out.println("it can not store");
					return true;
				}else {
					System.out.println("it can store it");
				}
			}
		}
		return false;
	}

	private void setcarName(String carName) {
		this.carName = carName;
	}

	public String getcarName() {
		return carName;
	}

	private void setcost(int cost) {
		this.cost = cost;
	}

	public int getcost() {
		return cost;
	}
}
