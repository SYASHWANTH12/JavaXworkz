package com.xworks.service;

import com.xworks.dto.ApplicationDTO;

public interface ApplicationService {
	public boolean validateAndSave(ApplicationDTO dto);

	public boolean findBYName(String name);
	public boolean findByNameAndDevelopedBy(String name, String developedBy);

	public boolean findAll();

	public boolean findByDevelopedBy(String name);

}
