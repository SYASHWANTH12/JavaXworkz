package com.xworks.repositary;

import com.xworks.dto.DeveloperDTO;
import com.xworks.dto.WeatherDTO;

public class DeveloperRepositaryImpl implements DeveloperRepositary {
	DeveloperDTO[] dto = new DeveloperDTO[TOTAL_VALUE];
	int pos;

	@Override
	public void save(DeveloperDTO dto) {
		if (pos < TOTAL_VALUE) {
			this.dto[pos] = dto;
			System.out.println(dto + " " + pos);
			pos++;
		}

	}

	@Override
	public boolean isExist(DeveloperDTO dto) {
		for (int i = 0; i <= this.pos; i++) {
			DeveloperDTO temp = this.dto[i];
			if (temp != null && temp.equals(dto)) {
				System.err.println("It can not store because it is having equal value");
				return true;
			}
		}
		return false;
	}

	@Override
	public DeveloperDTO findByName(String name) {
		for (int i = 0; i <= pos; i++) {
			DeveloperDTO ref = dto[i];
			if (ref.getName().equals(name)) {
				System.out.println("It has found on position=" + i);
				return ref;
			} else {
				System.err.println("It is not found");
			}
		}
		return null;
	}

}
