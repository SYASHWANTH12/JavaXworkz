package com.xworkz.app;

public interface EngineerRepository {
	
	int TOTAL_ITEMS=10;
	public void save(EngineerDTO D);
	default boolean isExist(EngineerDTO D){
		return false;
	}
	public EngineerDTO findBy(String name);
	
		
	

}
