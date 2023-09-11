package com.xworks.repositary;

import com.xworks.dto.CarDTO;

public class CarReposiatryImpl implements CarRepositary {
	// array,same value ,find,
	CarDTO[] S = new CarDTO[10];
	int pos;

	@Override
	public void save(CarDTO dto) {
		if (pos < 10) {
			this.S[pos] = dto;
			System.out.println(dto + "   " + pos);
			pos++;
		} else {
			System.err.println("It as out of Storage");
		}

	}
	public boolean isExist(CarDTO dto)
	{
		for(int index=0;index<=pos;index++)
		{
			CarDTO d=S[index];
			if(d!=null && d.equals(dto))
			{
				System.err.println("Sry try with another name");
				return true;
			}
		}
			System.out.println("It is not present in Storage");
		
		return false;
	}
@Override
public CarDTO findByName(String name) {
	for(int i=0;i<pos;i++)
	{
		CarDTO dto=S[i];
		if(dto.getcarName().equals(name))
		{
			System.out.println("it is found "+dto+"  "+pos);
			return dto;
		}else {
			System.out.println("++++++++++++++++++++++");
		}
		}
		return null;
}
}