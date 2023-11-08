package com.xworkz.news.util;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table you want");
		int number = sc.nextInt();
		int anotherNumber=sc.nextInt();
		int table;
		int tables;
		for (int i = 1; i <= 10; i++) {
			table = number * i;
			tables=anotherNumber*i;
			System.out.println(table+" "+tables);
			for(int j=0;j<=10;j++)
			{
			}
			
		}
	}
}
