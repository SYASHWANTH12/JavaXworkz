package com.xworkz.news.util;

public class CommonBtwTable {
	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		int[] table = new int[10];
		int[] tables=new int[10];

		for (int i = 1; i <= 10; i++) {
			if(i<10) {
			table[i] = m * i;
			int sum=table[i];
			
			}
		}
		for (int j = 1; j <= 10; j++) {
			if(j<10) {
			tables[j] = m * j;
			int sum=tables[j];
			
			}
		}
		for(int i=0;i<10;i++)
		{
			int s=table[i];
			for(int j=0;j<10;j++)
			{
				int y=tables[i];
				if(table==tables)
				{
					System.out.println("hh");
				}
			}
		}
	}
}
