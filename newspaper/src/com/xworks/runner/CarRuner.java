package com.xworks.runner;

import com.xworks.dto.CarDTO;
import com.xworks.repositary.CarReposiatryImpl;
import com.xworks.repositary.CarRepositary;
import com.xworks.service.CarServiceImpl;

public class CarRuner {
	public static void main(String[] args) {
		
	
	CarRepositary repo=new CarReposiatryImpl();
	CarServiceImpl im=new CarServiceImpl(repo);
	CarDTO  dto=new CarDTO("yashu", 67);
	CarDTO  dto1=new CarDTO("bimndi", 67);
	
	
	im.validateAndSave(dto);
	im.validateAndSave(dto1);
	im.findByName("yashu");
	}

}
