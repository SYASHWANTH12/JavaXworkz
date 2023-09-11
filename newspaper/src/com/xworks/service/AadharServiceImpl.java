package com.xworks.service;

import com.xworks.dto.AadharDTO;
import com.xworks.repositary.AadharRepositary;

public class AadharServiceImpl implements AadharService {
	AadharRepositary repo;
	AadharDTO dtos=new AadharDTO("yashu", 45);
	AadharDTO dtos1=new AadharDTO("bindu", 5);
	public AadharServiceImpl(AadharRepositary repo) {
		this.repo=repo;
	}
	@Override
	public boolean validate(AadharDTO dto) {
        if(dto!=null)
        {
        	String ref=dto.getName();
        	long ref1=dto.getAadharNumber();
        	if(ref!=null && !ref.isEmpty() && ref1!=0 && dtos.equals(dtos1))
        	{
        	repo.save(dto);
        	}else {
        		System.err.println("It is missing some thing");
        	}
        }
		return false;
	}

}
