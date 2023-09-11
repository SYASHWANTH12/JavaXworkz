package com.xworkz.app;

public class BusNumber {
int[] store=new int[10];
int pos;
public boolean check(int busnumber)
{
	for(int i=0;i<=pos;i++)
	{
		if(store[i]==busnumber)
		{
			System.out.println("it can not store");
			return true;
		}
	}
	this.store[pos]=busnumber;
	System.out.println(busnumber +" "+pos);
	pos++;
	return false;
}
public static void main(String[] info)
{
	BusNumber busNumber=new BusNumber();
	busNumber.check(5745);
	busNumber.check(5745);
}
}
