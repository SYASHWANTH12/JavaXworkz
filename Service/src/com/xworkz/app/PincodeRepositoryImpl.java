package com.xworkz.app;

public class PincodeRepositoryImpl implements PincodeRepository {
	String[] S=new String[10];
	int pos;
	@Override
	public boolean store(String name) {
		if(pos<10) {
		this.S[pos]=name;
		System.out.println("The pincode stored is ="+name+"The position is"+pos);
		pos++;
		}
		
		return false;
	}
	public  boolean isExist(String name )
	{
		for(int i=0;i<=pos;i++)
		{
			String temp=S[i];
			if(temp!=null && temp.equals(name))
			{
				System.err.println("It is already Stored");
				return true;
			}else {
				System.out.println("It is not Stored we can store it");
			}
		}
		return false;
	}


}
