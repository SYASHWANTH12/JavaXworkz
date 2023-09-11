package com.xworks.runner;

import com.xworks.dto.WeatherDTO;
import com.xworks.repositary.WeatherRepositaryImpl;
import com.xworks.repositary.WeatherRepository;
import com.xworks.service.WeatherServiceImpl;

public class WeatherRunner {
	public static void main(String[] info) {
		WeatherRepository repo = new WeatherRepositaryImpl();
		WeatherDTO repo3 = new WeatherDTO("is is raining", 32, true, 102);
		WeatherDTO repo4 = new WeatherDTO("is is rainings", 32, true, 102);
		WeatherServiceImpl repo1 = new WeatherServiceImpl(repo);

		repo1.validate(repo3);
		repo1.validate(repo4);
		repo1.finds("is is raining");
        
	}

}
