package com.xworks.service;

import com.xworks.dto.ApplicationDTO;
import com.xworks.repositary.ApplicationRepositary;

public class ApplicationServiceImpl implements ApplicationService {
	ApplicationRepositary repo;

	public ApplicationServiceImpl(ApplicationRepositary repo) {
		this.repo = repo;
	}

	@Override
	public boolean findBYName(String name) {
		if (name != null) {
			repo.findByName(name);
			System.out.println("-----------------------------------------");
			return true;
		}
		return false;
	}
	@Override
	public boolean findByNameAndDevelopedBy(String name, String developedBy) {
		if(name!=null && developedBy!=null)
		{
			repo.findByNameAndDevelopedBy(name, developedBy);
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAndSave(ApplicationDTO dto) {
		if (dto != null) {
			boolean temp=repo.equals(dto);
			String developedAt=dto.getdevelopedAt();
			String developedBy=dto.getdevelopedBy();
			int id=dto.getid();
			String name=dto.getname();
			String version=dto.getversion();
			if(!temp)
			{
				if(developedAt!=null && !developedAt.isEmpty())
				{
					System.out.println("It is valid to store developedAt");
				}
				if(developedBy!=null && !developedBy.isEmpty())
				{
					System.out.println("It is valid to store developedBy");

				}
				if(name!=null && !name.isEmpty())
				{
					System.out.println("It is valid to store name");

				}
				if(version!=null && !version.isEmpty())
				{
					System.out.println("It is valid to store version");

				}
				if(id!=0)
				{
					System.out.println("It is valid to store id");
				}
			repo.save(dto);
			System.out.println("----------------------------------");
			return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean findAll() {
		System.out.println(repo.findAll());
		System.out.println("--------------------------------------");
		return false;
	}

	@Override
	public boolean findByDevelopedBy(String name) {
		System.out.println(repo.findByDevelopedBy(name));
		System.out.println("-----------------------------------");
		return false;
	}
}
