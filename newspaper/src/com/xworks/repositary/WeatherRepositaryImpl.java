package com.xworks.repositary;

import com.xworks.dto.WeatherDTO;
import com.xworks.runner.WeatherRunner;

public class WeatherRepositaryImpl implements WeatherRepository {
	WeatherDTO[] dto = new WeatherDTO[10];
	int pos;
	WeatherRunner run;

	@Override
	public void save(WeatherDTO weather) {
		if (pos < 10) {
			this.dto[pos] = weather;
			System.out.println(weather + "   " + pos);
			pos++;
		}

	}

	@Override
	public boolean isExist(WeatherDTO weather) {
		for (int i = 0; i <= pos; i++) {
			WeatherDTO temp = dto[i];
			if (temp != null && temp.equals(weather)) {
				System.out.println("It can  not store the value");
				return true;
			} else {
				System.out.println("It can store it");
			}
		}
		return false;
	}
	public WeatherDTO find(String name)
	{
		System.out.println("________________________");
		for(int i=0;i<pos;i++)
		{
			WeatherDTO y=dto[i];
			if(y.getWeatherReport().equals(name))
			{
				System.out.println("It is found in the reference "+y);
				return y;
			}else {
				System.err.println("It is not found");
			}
		}
		return null;
	}

}
