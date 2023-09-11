package com.xworkz.app;

public interface PhoneRepository {
	public final int TOTAL_VALUE=10;
public void store(long number);
default boolean isExist(long number) {
	return false;
}
}
