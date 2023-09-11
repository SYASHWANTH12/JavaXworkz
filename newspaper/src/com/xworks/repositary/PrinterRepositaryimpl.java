package com.xworks.repositary;

import com.xworks.dto.PrinterDTO;

public class PrinterRepositaryimpl implements PrinterRepositary {
	PrinterDTO[] dto = new PrinterDTO[10];
	int pos;

	@Override
	public void save(PrinterDTO dto) {
		this.dto[pos] = dto;
		System.out.println(dto + " " + pos);
		pos++;

	}
@Override
public boolean isExist(PrinterDTO dto) {
	// TODO Auto-generated method stub
	return false;
}
}
