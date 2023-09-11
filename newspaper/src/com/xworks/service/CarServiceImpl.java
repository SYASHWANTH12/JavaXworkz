package com.xworks.service;

import com.xworks.dto.CarDTO;
import com.xworks.repositary.CarRepositary;

public class CarServiceImpl implements CarService{
	CarRepositary repo;
	public CarServiceImpl(CarRepositary repo) {
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(CarDTO dto) {
		if(dto!=null)
		{
			System.out.println("dto is not pointing to the null");
			repo.isExist(dto);
			if(repo.isExist(dto)==false)
			{
				System.out.println("It is starting to store");
			repo.save(dto);
			}else {
				System.out.println("Sry i can not store");
			}
		}
		return false;
	}
	@Override
	public boolean findByName(String name) {
		if(name!=null && !name.isEmpty())
		{
			repo.findByName(name);
			return true;
		}else {
			System.out.println("------------------------");
		}
		return false;
	}

}
