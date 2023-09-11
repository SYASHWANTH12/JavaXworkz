package com.xworks.repositary;

import com.xworks.dto.DeveloperDTO;
import com.xworks.dto.WeatherDTO;

public interface DeveloperRepositary {
	public final int TOTAL_VALUE = 10;

	public void save(DeveloperDTO dto);

	public boolean isExist(DeveloperDTO dto);

	public DeveloperDTO findByName(String name);

}
