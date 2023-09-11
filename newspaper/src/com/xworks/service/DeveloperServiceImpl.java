package com.xworks.service;

import com.xworks.dto.DeveloperDTO;
import com.xworks.repositary.DeveloperRepositary;

public class DeveloperServiceImpl implements DeveloperService {
	DeveloperRepositary repo;

	public DeveloperServiceImpl(DeveloperRepositary repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(DeveloperDTO D) {
		if (D != null) {
			String desi = D.getDesignation();
			int exp = D.getExperience();
			String name = D.getName();
			double salary = D.getSalary();
			String workingfor = D.getWorkingFor();
			boolean diif = D.isDifficult();
			boolean T = repo.isExist(D);
			if (T == false) {
				System.out.println("It can Store But checking the Createria");
				if (desi != null && !desi.isEmpty() && exp != 0 && name != null && !name.isEmpty() && salary != 0
						&& workingfor != null && !workingfor.isEmpty()) {

					repo.save(D);
				} else {
					System.err.println("Some Condition is missing");
				}
			} else {
				System.err.println("It is Already stored into space");
			}
		} else {
			System.err.println("It is pointing to null");
		}
		return false;
	}

}
