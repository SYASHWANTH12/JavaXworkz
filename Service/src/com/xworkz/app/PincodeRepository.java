package com.xworkz.app;

public interface PincodeRepository {
	public boolean store(String name);
	default boolean isExist(String name )
	{
		return false;
	}

}
