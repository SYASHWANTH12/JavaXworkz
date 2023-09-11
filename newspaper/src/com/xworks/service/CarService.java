package com.xworks.service;

import com.xworks.dto.CarDTO;

public interface CarService {
	public boolean validateAndSave(CarDTO dto);
   public boolean findByName(String name);
   }
