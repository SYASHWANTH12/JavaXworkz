package com.xworks.service;

import com.xworks.dto.WeatherDTO;
import com.xworks.repositary.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	WeatherRepository repo;

	public WeatherServiceImpl(WeatherRepository repo) {
		this.repo = repo;

	}

	@Override
	public boolean validate(WeatherDTO dto) {
		if (dto != null) {
			int celsius = dto.getCelsius();
			int degree = dto.getDegree();
			String weather = dto.getWeatherReport();
			boolean rain = dto.isRain();
			boolean ref = repo.isExist(dto);

			if (!ref && celsius != 0 && degree != 0 && weather != null && !weather.isEmpty()) {
				System.out.println("=================");
				repo.save(dto);

			} else {
				System.err.println("It is not matching some condition");
			}
		} else {
			System.err.println("It is pointing to the null");
		}
		return false;

	}

	public boolean finds(String name) {
		if (name != null && !name.isEmpty()) {
			repo.find(name);
			return true;
		}else {
			System.out.println("_-------------------");
		}
		return false;
	}

}
