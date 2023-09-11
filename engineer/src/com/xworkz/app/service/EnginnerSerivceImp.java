package com.xworkz.app.service;

import com.xworkz.app.*;

public class EnginnerSerivceImp implements EngineerService {
	
	private EngineerRepository repo;
	
	public EnginnerSerivceImp(EngineerRepository repo) {
		this.repo=repo;
		
	}@Override
	public void saveAndValidation(EngineerDTO D) {
		if(D!=null) {
			System.out.println("it is not poiting to null");
			repo.save(D);
			
			
			
		}
			
		
	}

}
