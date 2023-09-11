package com.xworks.repositary;

import com.xworks.dto.CarDTO;

public interface CarRepositary {
	public void save(CarDTO dto);
	public boolean isExist(CarDTO dto);
	public CarDTO findByName(String name);
	

}
