package com.xworkz.news.util;

import java.util.Scanner;

public class Sqaure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum = i * i;
			if (sum == number) {
				System.out.println("It is A Sqaure ..");
			} 
		}
		System.out.println("It is not a square");

	}
}
