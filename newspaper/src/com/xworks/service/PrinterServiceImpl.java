package com.xworks.service;

import com.xworks.dto.PrinterDTO;
import com.xworks.repositary.PrinterRepositary;

public class PrinterServiceImpl implements PrinterService {
	PrinterRepositary repo;

	public PrinterServiceImpl(PrinterRepositary repo) {
		this.repo = repo;
	}

	@Override
	public boolean validate(PrinterDTO dto) {
		if (dto != null) {
			String name = dto.getName();
                           boolean temp=repo.isExist(dto);
                        		   int price = dto.getPrice();
			if(name!=null && !name.isEmpty() &&name.length()>3 &&name.length()<20 && price!=0)
			{

			repo.save(dto);
			}else {
				System.out.println("Some condtion is missing");
			}
		}else {
			System.err.println("it is POINTING TO the null");
		}

		return false;
	}

}
