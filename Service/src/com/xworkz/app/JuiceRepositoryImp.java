package com.xworkz.app;

public class JuiceRepositoryImp implements JuiceRepository {

	String[] juice = new String[TOTAL_ITEMS];
	int position;

	public boolean store(String name) {
		this.juice[position] = name;

		System.out.println("item name is   " + name + "  position  " + this.position + "negative ");
		position++;
		return true;

	}
                             // 0    1       2
//{null,null,null,null,null}//yashu,sumanth,shivukumar
	public boolean isExist(String name) {
		for (int i = 0; i <= this.position; i++) {
			String temp = juice[i];// onion,rice
			if (temp != null && temp.equals(name)) {
				System.err.println("it can not store");
				return true;
			}

		}
		return false;
	}

}
