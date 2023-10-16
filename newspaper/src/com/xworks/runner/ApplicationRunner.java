package com.xworks.runner;

import com.xworks.dto.ApplicationDTO;
import com.xworks.repositary.ApplicationRepositary;
import com.xworks.repositary.ApplicationRepositaryImpl;
import com.xworks.service.ApplicationServiceImpl;

public class ApplicationRunner {
	public static void main(String[] args) {
		ApplicationRepositary ref = new ApplicationRepositaryImpl();
		ApplicationServiceImpl ref1 = new ApplicationServiceImpl(ref);
		ApplicationDTO ref2 = new ApplicationDTO(1, "Coferge", "yahsu", "hsa", "java");
		ApplicationDTO ref3 = new ApplicationDTO(2, "Tcs", "sumanth", "yahs", ".net");
		ApplicationDTO ref4 = new ApplicationDTO(3, "Accenture", "Ranjth", "shivamogga", "phython");
		ApplicationDTO ref5 = new ApplicationDTO(4, "Infosys", "Madhu", "Chikmangaluru", "html");
		ApplicationDTO ref6 = new ApplicationDTO(5, "Wipro", "Om", "Xworks", "All");
		ApplicationDTO ref7 = new ApplicationDTO(6, "Zoho", "Prajwal", "bangalore", "Sql");
		ref1.validateAndSave(ref2);
		ref1.validateAndSave(ref3);
		ref1.validateAndSave(ref4);
		ref1.validateAndSave(ref5);
		ref1.validateAndSave(ref6);
		ref1.validateAndSave(ref7);
		System.out.println(ref1.findBYName("Coferge"));
		System.out.println(ref1.findByNameAndDevelopedBy("Tcs", "yahs"));
		ref1.findAll();
		ref1.findByDevelopedBy("Coferge");
		ref1.findByDevelopedBy("Tcs");
		ref1.findByDevelopedBy("Zoho");

	}
}