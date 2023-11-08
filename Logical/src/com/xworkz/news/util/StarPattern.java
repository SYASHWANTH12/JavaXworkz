package com.xworkz.news.util;

public class StarPattern {
	public void star(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				for(int p=0;p<=i;p++)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
public static void main(String[] args) {
	StarPattern pattern=new StarPattern();
	pattern.star(5);
}
}
