package com.xworkz.app;

public interface JuiceRepository {

	int TOTAL_ITEMS = 5;

	public boolean store(String name);

	default boolean isExist(String name) {
		return false;
	}

}
