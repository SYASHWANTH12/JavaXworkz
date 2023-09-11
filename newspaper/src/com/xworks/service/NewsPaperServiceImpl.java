package com.xworks.service;

import com.xworks.dto.NewsPaperDTO;
import com.xworks.repositary.NewsPaperRepositary;

public class NewsPaperServiceImpl implements NewsPaperService {
	NewsPaperRepositary repositary;

	public NewsPaperServiceImpl(NewsPaperRepositary repositary) {
		this.repositary = repositary;
	}

	@Override
	public boolean validation(NewsPaperDTO dto) {
		if (dto != null) {
			int cost = dto.getCost();
			String name = dto.getName();
			double price = dto.getPrice();
			String brand = dto.getBrand();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("name is valid ");
			} else {
				System.err.println("it is not valid.");
				return false;
			}
			if (cost != 0 && price != 0) {
				System.out.println("cost and price is valid to store");
			} else {
				System.err.println("It is not valid..");
				return false;
			}
			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
				System.out.println("brand  is valid ");
			} else {
				System.err.println("it is not valid....");
				return false;
			}
			repositary.save(dto);
			System.out.println(dto + "  ");
		}
		return false;
	}

}
