package com.xworkz.app;

public class TrianNoRepositoryImpl implements TrainNoRepository {
	String[] train=new String[10];
	int increment;
	
	@Override
	public boolean store(String trainno) {
		this.train[increment]=trainno;
		System.out.println("The train no is="+trainno+"it is stored in poisition "+increment);
		increment++;
		return false;
		
		
		
	}
	@Override
	public boolean isExist(String trainno) {
		for(int i=0;i<=increment;i++)
		{
			String temp=train[i];
			if(temp!=null && temp.equals(trainno))
			{
				System.err.println("It can't be stored ");
				return true;
			}
			else {
				System.out.println("it can be stored");
			}
		}
		return false;
	}
}
