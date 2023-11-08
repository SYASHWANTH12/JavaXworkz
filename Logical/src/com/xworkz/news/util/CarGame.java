package com.xworkz.news.util;

public class CarGame {
public static void main(String[] args) {
int number=1;
boolean prime=true;
for(int i=2;i<number;i++)
{
	if(number%i==0)
	{
		prime=false;
		System.out.println(i);
		
	}
}
System.out.println(prime);
   }
}
			
		
		
		
		
		
		
//	int[] numbers= {3,1,5,4,2};
//	for(int i=0;i<numbers.length;i++)
//	{
//		for(int j=i+1;j<=numbers.length;j++)
//		{
//			
//		}
//	}
	
