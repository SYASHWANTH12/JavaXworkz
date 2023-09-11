package com.xworks.runner;

import com.xworks.dto.DeveloperDTO;
import com.xworks.repositary.DeveloperRepositary;
import com.xworks.repositary.DeveloperRepositaryImpl;
import com.xworks.service.DeveloperServiceImpl;

public class DeveloperRunner {
public static void main(String[] info)
{
	DeveloperRepositary ref=new DeveloperRepositaryImpl();
	DeveloperServiceImpl ref1=new DeveloperServiceImpl(ref);
	DeveloperDTO ref2 =new DeveloperDTO("yashu", 45,60, "1234", "yahsu", true);
	DeveloperDTO ref3=new DeveloperDTO("yashu", 45,60, "1234", "yahsu", true);
	ref1.validateAndSave(ref2);
	ref1.validateAndSave(ref3);
	ref.findByName("yashu");
	
	
	
}
}
//same -true
//same -true
