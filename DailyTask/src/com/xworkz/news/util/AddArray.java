package com.xworkz.news.util;

import java.util.Scanner;

public class AddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the array numbers");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Enter the sum you want to find");
		int total=sc.nextInt();
		for (int i = 0; i < size; i++) {
			int arr = array[i];
			for (int j = 1; j < size; j++) {
				int arrs = array[j];
				int sum = array[i] + array[j];
				if (sum == total) {

					System.out.println("The first number is" + arr + " The second number is " + arrs);
					break;
				}
			}

		}
	}
}
