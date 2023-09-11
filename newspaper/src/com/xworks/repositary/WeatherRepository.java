package com.xworks.repositary;

import com.xworks.dto.WeatherDTO;

public interface WeatherRepository {
public void save(WeatherDTO weather);
public boolean isExist(WeatherDTO weather);
public WeatherDTO find(String name);

}
