package com.xworks.repositary;

import com.xworks.dto.ApplicationDTO;

public interface ApplicationRepositary {
	public void save(ApplicationDTO dto);
	public boolean isExist(ApplicationDTO dto);
	public ApplicationDTO findByName(String name);
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy);
	public ApplicationDTO findAll();

	public ApplicationDTO findByDevelopedBy(String name);

}
