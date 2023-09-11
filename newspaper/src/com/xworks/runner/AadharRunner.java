package com.xworks.runner;

import com.xworks.dto.AadharDTO;
import com.xworks.repositary.AadharRepositary;
import com.xworks.repositary.AadharRepositaryImpl;
import com.xworks.service.AadharServiceImpl;

public class AadharRunner {
public static void main(String[] args) {
	AadharRepositary name = new AadharRepositaryImpl();
	AadharServiceImpl name1=new AadharServiceImpl(name);
	AadharDTO name2=new AadharDTO();
	name1.validate(name2);
	
}
}
