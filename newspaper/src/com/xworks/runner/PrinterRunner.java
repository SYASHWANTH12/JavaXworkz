package com.xworks.runner;

import com.xworks.dto.PrinterDTO;
import com.xworks.repositary.PrinterRepositary;
import com.xworks.repositary.PrinterRepositaryimpl;
import com.xworks.service.PrinterServiceImpl;

public class PrinterRunner {
	public static void main(String[] args) {
		PrinterRepositary repo=new PrinterRepositaryimpl();
		PrinterServiceImpl repo1=new PrinterServiceImpl(repo);
		PrinterDTO dto=new PrinterDTO("Sumnath", 67);
		PrinterDTO dto1=new PrinterDTO("Sumnath", 47);
		repo1.validate(dto);
		repo1.validate(dto1);
		
	}

}
